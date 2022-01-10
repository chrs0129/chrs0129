package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[][] arr2D = {{12, 14, 32}, {45, 56, 89, 12}, {34, 87, 90, 76, 34, 70}};
        for (int[] each : arr2D) {
            System.out.println(Arrays.toString(each));
            for (int i : each) {
                System.out.print(i +" ");

            }
            System.out.println();
        }

    }
}
