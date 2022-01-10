package Homework;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 6;
        String floorSelect = "";

        if (floorNum >= 1 && floorNum <= 3) {
            switch (floorNum) {
                case 1:
                    floorSelect = ("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                    break;
                case 2:
                    floorSelect = ("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                    break;
                default:
                    floorSelect = ("Floor 3 selected. Companies: Lyft, BofA, Stake house");

            }
            System.out.println(floorSelect);

        } else {
            System.out.println("Wrong floor is selected" + " - " + floorNum);
        }
        System.out.println("------------------------------------------");
        if (floorNum <= 1 && floorNum <= 3) {
            if (floorNum == 1) {
                floorSelect  = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            } else if (floorNum == 2) {
                floorSelect = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            } else {
                floorSelect ="Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }
        } else {
            floorSelect = "Wrong floor is selected";
        }
        System.out.println(floorSelect);
    }
}
/*
Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */
