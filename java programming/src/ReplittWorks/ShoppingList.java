package ReplittWorks;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input: ");
        String s = input.nextLine();
        int balance = 100;
        int Blanket = 60;
        int Charger = 15;
        int Hat = 25;
        int Headphones = 30;
        int Laptop = 200;
        int Pants = 50;
        int Pillow = 40;
        int Smartphone = 1000;
        int Socks = 5;
        int USB_cable = 10;
        switch (s){
            case "Blanket" :
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - Blanket));
        break;
            case "Charger" :
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - Charger));
        break;
            case  "Hat" :
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - Hat));
        break;
            case "Headphones" :
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - Headphones));
                break;
            case "Laptop" : case "Smartphone" :
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Pants" :
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - Pants));
                break;
            case "Pillow" :
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - Pillow));
break;
            case "Socks" :
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - Socks));
            case "USB cable" :
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - Headphones));
            default:
                System.out.println("Invalid item!");

        }


input.close();
    }
}
