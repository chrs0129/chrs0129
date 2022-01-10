package day07_Operators;

public class Castings {
    public static void main(String[] args) {
        float averegeScore = 20.5f;
        byte num1 = (byte) averegeScore;
        short num2 = (short) averegeScore;
        int num3 = (int) averegeScore;
        long num4 = (long) averegeScore;
        float num5 = averegeScore; // no casting
        double num6 = averegeScore; // implicit casting
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
    
    }


}






