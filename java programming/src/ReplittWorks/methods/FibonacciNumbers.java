package ReplittWorks.methods;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
        scan.close();
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
int num1=0;
int num2 =1;
        int sum = 0;
String fibonacci = "";
        for (int i = 2; i <=num ; i++) {
           sum=num1 +num2;
            num1 = num2;
            num2=sum;
            fibonacci = "" + sum;
        }

            System.out.println(sum);
            System.out.println("(Explanation : because number " + num +
                    " in the sequence of 0, 1" + fibonacci + " --> " + sum);
        }




    }



