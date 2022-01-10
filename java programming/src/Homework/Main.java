package Homework;

public class Main {
    public static void main(String[] args) {
        int secondsTotal = 18700;
        int hours = secondsTotal/3600;
        int minutes = secondsTotal %3600 / 60 ;
        int seconds = secondsTotal % 3600 %60  ;
        System.out.println("hours = " + hours);
        System.out.println("minutes = " + minutes);
        System.out.println("seconds = " + seconds);



    }
}
