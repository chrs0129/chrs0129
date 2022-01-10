package ReplittWorks;

import java.util.Scanner;

public class EverageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};
        double sum =0;

        for (int i = 0; i <temps.length ; i++) {
            sum +=temps[i];

        }
double everageTemperature =sum/temps.length;
        System.out.println(everageTemperature);

        scan.close();
    }
}
