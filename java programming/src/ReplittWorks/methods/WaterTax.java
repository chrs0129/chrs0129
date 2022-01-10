package ReplittWorks.methods;

import java.util.Scanner;

public class WaterTax {
    public static double waterTax(double units) {
        double bill = 0.0;

        //your code here


        if (units > 150) {
            bill = units * 0.9 + 100;

        } else if (units > 100) {
            bill = units * 0.9 + 50;
        } else if (units > 50) {
            bill = units * 0.90;}
        else if (units>0){
                bill = units * 0.60;
            }



            //end your code here

            return bill;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
        in.close();
    }
    }



/*
The waterTax method calculates a water bill. The method takes a double and returns a double.

The more water you use the more it will cost you

Cost under 50:

bill = units * 0.60;
bill = units * 0.60;
Cost above 50:

bill = units * 0.90;
bill = units * 0.90;
Cost above 100 the calculation is same as above 50 but an additional 50 fine

Cost above 150 its the same as above 50 but an additional 100 fine

Examples:

waterTax(50)
​
returns 30
waterTax(50)

returns 30
waterTax(55)
​
returns 49.5
 */