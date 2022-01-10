package day09_If_Statements;

public class medianNumber {
    public static void main(String[] args) {
        int a = 40, b = 20, c = 30;
        boolean aIsMedian = (a > b && a < c) || (a < b && a >c) ;
        boolean bIsMedian = (b > a && b < c) || (b < a && b > c);
        boolean cIsMedian = !aIsMedian && !bIsMedian;
        if (aIsMedian){
            System.out.println(a + " is median number");
        }
        if (bIsMedian){
            System.out.println(b + " is median number");
        }
        if (cIsMedian){
            System.out.println(c + " is median number");

        }

    }






}
