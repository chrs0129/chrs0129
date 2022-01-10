package Homework;

public class Address {
    public int buildingNumber;
    public String street, city, state;
    int zipcode;

    public Address(int buildingNumber, String street, String city, String state, int zipcode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String toString() {
        return buildingNumber +
                ", " + street +"\n"+
                city + ", " +
                state + " " +
                zipcode;
    }
}
