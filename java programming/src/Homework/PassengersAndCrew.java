package Homework;

public class PassengersAndCrew {
    public static void main(String[] args) {

        int peopleNumber = 70;

        String output = "";
        if (peopleNumber == 50 || peopleNumber == 75 || peopleNumber == 100){
            output = (peopleNumber >= 75)? "25 crew, 50 passengers" :(peopleNumber >= 50)? "20 crew, 30 passengers" : "30 crew, 70 passengers";
        }else {
           output = "Invalid input";
        }
        System.out.println(output);
    }
}
/*
Create a class called CrewAndPassanger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */
