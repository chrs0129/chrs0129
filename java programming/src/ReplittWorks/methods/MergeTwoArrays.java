package ReplittWorks.methods;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
    public static int[] mergR(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length - 2];

        int z = 0;
        for (int each : a) {
            arr[z++] = each;
        }
        for (int each1 : b) {
            arr[z++] = each1;

        }
        return arr;


    }//end mergR

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];
        int[] nums2 = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(mergR(nums, nums2)));
        in.close();
    }
}

