package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {
    public static void main(String[] args) {
        String[] group1 = {"hh", "kk", "nn"};
        String[] group2 = {"rr", "gg", "mm"};
        String[] group3 = {"ww", "ee", "ss"};

        String[][] groups = new String[3][];
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;
        System.out.println(Arrays.deepToString(groups));
        System.out.println("-----------------------------");
        int[][] arr2D = {{12, 14, 32}, {45, 56, 89, 12}, {34, 87, 90, 76, 34, 70}};
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[2][4]);




    }
}
