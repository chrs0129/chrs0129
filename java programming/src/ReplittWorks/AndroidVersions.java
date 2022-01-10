package ReplittWorks;

import java.util.Scanner;

public class AndroidVersions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double version = input.nextDouble();
        String result = "";
        if (version == 1.5 || version == 1.6 || version == 2.1
                || version == 2.2 || version == 2.3 || version == 3.1 || version == 4.0 || version == 4.1 || version == 4.4 || version == 5.0 || version == 8.0 || version == 9.0) {
            if (version == 1.5) {
                result = "Cupcake";
            } else if (version == 1.6) {
                result = "Donut";
            } else if (version == 2.1) {
                result = "Eclair";
            } else if (version == 2.2) {
                result = "Froyo";
            } else if (version == 2.3) {
                result = "Gingerbread";
            } else if (version == 3.1) {
                result = "Honeycomb";
            } else if (version == 4.0) {
                result = "Ice Cream Sandwich";
            } else if (version == 4.1) {
                result = "Jelly Bean";
            } else if (version == 4.4) {
                result = "KitKat";

            } else if (version == 5.0) {
                result = "Lollipop";

            } else if (version == 8.0) {
                result = "Oreo";
            } else {
                result = "Pie";
            }

        } else {
            result = "Sorry, I don't know this version!";
        }
        System.out.println(result);

        input.close();



    }

}

