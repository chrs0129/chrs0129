package Homework;

import java.util.Locale;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)?");
        String str1 = scan.nextLine();
        System.out.println("Enter the number of people");
        int persons = scan.nextInt();
        System.out.println("Enter the check amount:");
        int sum = scan.nextByte();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");

        String serviceQuality = scan.next();
        System.out.println();
        str1 =str1.toLowerCase();
        serviceQuality =serviceQuality.toLowerCase();

        double tip=0;

        if(serviceQuality.equals("excelent")){ tip = sum*0.25;}else if (serviceQuality.equals("great")){
            tip = sum*0.2;
        }else if (serviceQuality.equals("good")){
            tip = sum*0.15;
        }else if (serviceQuality.equals("fair")) {
            tip = sum * 0.1;
        }else {tip = sum*0.05;}
        double totalSum = sum + tip;

        if (str1.equals("yes")){totalSum= totalSum =totalSum/persons;
        System.out.println("Total per person: " + totalSum);}
        System.out.println("Total :" + totalSum);



        scan.close();
    }

}
/*
2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

            Split or No split (Yes or No),
            Number of people entered: (number)
            Check amount: (number)
            Service Quality: (String)

	And display:
	    Number of people entered:
        Total to pay:
        Total tip:
        Total per person:
        Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method

 */