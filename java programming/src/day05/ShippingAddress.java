package day05;

public class ShippingAddress {
    public static void main(String[] args) {
        /*Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

         */
        String name = "Konstantin Fegeding";
        int buildingNumber = 11919;
        String streetName = "Parklawd Dr.",
                city = "Rockville",
                state = "MD",
                zipCode = "20852";
        String addres = name + "\n" + buildingNumber + " " + streetName + "\n" + city + "\n" + state + " " + zipCode;
        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + "\n" + state + " " + zipCode);
        System.out.println(addres);

    }


}
