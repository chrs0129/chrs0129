package ReplittWorks;

import java.util.Scanner;

public class HasFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        boolean hasFive = false;
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] == 5 && nums[i + 1] == 5) {
                hasFive =true;
                System.out.println(hasFive);
            }
            input.close();

        }


    }
}
