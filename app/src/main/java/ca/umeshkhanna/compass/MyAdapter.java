package ca.umeshkhanna.compass;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/*created using Android Studio (Beta) 0.8.14
www.101apps.co.za*/

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<ListingData> listingDataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewAddress;
        TextView textViewBed;
        TextView textViewPrice;
        TextView textViewBath;
        ImageView imageViewIcon;


        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewAddress = (TextView) itemView.findViewById(R.id.textViewAddress);
            this.textViewBed = (TextView) itemView.findViewById(R.id.textViewBed);
            this.textViewBath = (TextView) itemView.findViewById(R.id.textViewBath);
            this.textViewPrice = (TextView) itemView.findViewById(R.id.textViewPrice);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

    public MyAdapter(ArrayList<ListingData> listing) {
        this.listingDataSet = listing;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        view.setOnClickListener(MainActivity.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewAddress = holder.textViewAddress;
        TextView textViewPrice = holder.textViewPrice;
        TextView textViewBed = holder.textViewBed;
        TextView textViewBath = holder.textViewBath;
        ImageView imageView = holder.imageViewIcon;

        textViewAddress.setText(listingDataSet.get(listPosition).getName());
        String listingPrice = "$" + listingDataSet.get(listPosition).getPrice();
        textViewPrice.setText(listingPrice);

        String amountOfBeds = listingDataSet.get(listPosition).getNumOfBed() + " BED";
        String amountOfBaths = String.valueOf(listingDataSet.get(listPosition).getNumOfBath()) + " BATH";

        textViewBed.setText(amountOfBeds);
        textViewBath.setText(amountOfBaths);


        imageView.setImageResource(listingDataSet.get(listPosition).getImage());
    }

    @Override
    public int getItemCount() {
        return listingDataSet.size();
    }
}
