package day34_GarbageCollectio_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi = 3.14;
    public static String name = "Circle";
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public Circle(double radius) {
        this.radius = radius;
    }

    static {
        pi = 3.14;
        name = "Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

    /*public static void main(String[] args) {
        pi=3.14;;
        numbers = new ArrayList<>();
        name ="Circle";
        numbers.add(10);
        numbers.add(20);
    }

     */
}
