package ReplittWorks;

import java.util.Scanner;

public class Find_Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));
        int sum =0;
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        for (int each : nums) {
           sum += each;

        }
        System.out.println(sum);

        input.close();
    }
}
