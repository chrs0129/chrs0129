package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        // assignment: =
        int number = 100;
        System.out.println("number = " + number); // 100
        number = 200;
        System.out.println("number = " + number);// 200
        String word = "Java Programming";
        System.out.println("word = " + word); //Java Programming
        word = "Wooden Spoon";
        System.out.println("word = " + word); //Wooden Spoon
        word = "Cydeo";
        System.out.println("word = " + word);//Cydeo
        System.out.println("-----------------------------------------");
        //Addition assignment
        int x =100;
        System.out.println("x = " + x);
 x += 200; // add 200 to x
        System.out.println("x = " + x);
String str = "Wooden";
str += " Spoon";
        System.out.println("str = " + str);

double num1 = 2.5;
        System.out.println("num1 = " + num1);
        num1 +=5.5;
        System.out.println("num1 = " + num1);
double availableBalance = 1000.50;
// deposit
        System.out.println("availableBalance = " + availableBalance);
        availableBalance +=300;
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("----------------------------------------");
        //wothdrowing 500
        availableBalance -=500;
        System.out.println("availableBalance = " + availableBalance);
availableBalance -=200;
        System.out.println("availableBalance = " + availableBalance);
        availableBalance +=400;
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("-----------------------------------------");
        double salary = 50000.0;
        System.out.println("salary = " + salary);
        salary *=2;
        System.out.println("salary = " + salary);
        double doge = 0.000001;
        System.out.println("doge = " + doge);
     doge *=1000000;
        System.out.println("doge = " + doge);
        System.out.println("---------------------------------------");
        double num2 = 25000;
        System.out.println("num2 = " + num2);
        num2 /=2;
        System.out.println("num2 = " + num2);
        System.out.println("----------------------------------------");
        double num3 = 100;
        System.out.println("num3 = " + num3);
        num3 %=3;
        System.out.println("num3 = " + num3);
        System.out.println("-------------------------------------------");
int amount = 127; //cents
        System.out.println("amount = " + amount);
        amount /=25;
        System.out.println("amount = " + amount);
                amount %=2;
        System.out.println("amount = " + amount);
        System.out.println("------------------------------------------");
        int y = 300;
        y %=16;
        System.out.println("y = " + y);
        System.out.println("------------------------------------------");
        int balance = 3500;
        // insurance fee: $153
        balance %=153;
        System.out.println("balance = " + balance);




    }




}
