package Homework;

public class OxygenTank {
    public static void main(String[] args) {
        int oxygenPercent = 50;
        String statement = "";
        if (oxygenPercent >= 50 && oxygenPercent <= 100) {
            if (oxygenPercent > 90) {
                statement = "Your tank is full";
            }
            if (oxygenPercent > 80) {
                statement = "Still okay";
            }
            if (oxygenPercent > 70) {
                statement = "Dont't go to far";
            }
            if (oxygenPercent > 60) {
                statement = "Start to head back";
            } else {
                statement = "Be careful you at 50%";
            }
            System.out.println(statement);


        }
    }
}
/*
 Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */