package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "acdb";
        String str2 = "dbca";
        char[] arr1 = str1.toUpperCase().toCharArray();
        char[] arr2 = str2.toUpperCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        boolean result = Arrays.equals(arr1,arr2);
        System.out.println(result);

    }
}
