package Homework;

public class CappucinoBuyer {
    public static void main(String[] args) {
String size = "Large";
String priceCalories = "";
switch (size){
    case "Tall" :
        priceCalories = " price is $3.69\n\t\t 90 calories";
        break;
    case "Grande" :
        priceCalories = " price is $3.99\n\t\t120 calories";
        break;
    case "Venti" :
        priceCalories = " price is $4.69/\n\t\t\150 calories";
        break;
    default:
        priceCalories = "Invalid Size";
        break;
}
        System.out.println(size + ":" + "\n\t\t" + priceCalories);
    }
}
/*
Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */