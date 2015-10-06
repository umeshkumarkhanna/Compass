package ca.umeshkhanna.compass;

/**
 * Created by umeshkhanna on 15-10-06.
 */
public class ListingData {

    String name;
    String address;
    String price;
    int numOfBed;
    String numOfBath;
    String contactPerson;
    String contactPersonNumber;
    int image;
    int id_;

    public ListingData(String name,
                       String address,
                       String price,
                       int  numOfBed,
                       String numOfBath,
                       String contactPerson,
                       String contactPersonNumber,
                       int image,
                       int id_)
    {
        this.name = name;
        this.address = address;
        this.price = price;
        this.numOfBed = numOfBed;
        this.numOfBath = numOfBath;
        this.contactPerson = contactPerson;
        this.contactPersonNumber = contactPersonNumber;
        this.image = image;
        this.id_ = id_;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPrice() {
        return price;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getContactPersonNumber() {
        return contactPersonNumber;
    }

    public int getImage() {
        return image;
    }

    public int getNumOfBed() {
        return numOfBed;
    }

    public String getNumOfBath() {
        return numOfBath;
    }

    public int getId() {
        return id_;
    }
}