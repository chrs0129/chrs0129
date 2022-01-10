package day09_If_Statements;

public class MinNumber {
    public static void main(String[] args) {


        int n1 = 200, n2 = 200;
        boolean possibility1 = n1 < n2;
        boolean possibility2 = n1 > n2;
        boolean possibility3 = n1 == n2;
if(possibility1){// if n1 is minimum number
    System.out.println(n1 + " is minimum number");
}
        if (possibility2){// if n2 is minimum number
            System.out.println(n2 + " is minimum number");
        }
        if (possibility3){
            System.out.println("Equal");
        }








    }
}
