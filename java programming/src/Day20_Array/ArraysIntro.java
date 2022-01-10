package Day20_Array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        String[] myGroup = new String[5];

        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";

        System.out.println(Arrays.toString(myGroup));
        System.out.println("-----------------------------");
String[] days={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sanday" };
        System.out.println(Arrays.toString(days));
int number =8;
        if (number <1 || number>7 ){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number -1]);

    }

}
