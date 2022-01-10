package day26_CustommethodsPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6};
        int[] arr2 = reverseArray(arr1);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] reverseArray(int[] array){
        int[] result = new int[array.length];
        for (int i = array.length-1, j=0; i>=0 ; i--, j++) {
            result[j]=array[i];

        }
        return result;
    }
}
