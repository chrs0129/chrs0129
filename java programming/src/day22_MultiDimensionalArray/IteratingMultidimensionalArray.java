package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr2D = {{12, 14, 32}, {45, 56, 89, 12}, {34, 87, 90, 76, 34, 70}};
        for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();
            System.out.println("------------------------------");

            for (int k = 0; k < arr2D.length; k++) {

                for (int l = arr2D[k].length - 1;l >= 0;l--) {
                    System.out.print(arr2D[k][l] +" ");
                }
                System.out.println();
            }
        }
        System.out.println("------------------------------------");



    }
}
