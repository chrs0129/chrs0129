package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
int[] arr ={1,1,1,2,3,5,5,5,6,6,7,7,8};
arr=removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] removeDuplicates(int[] array){
        int[] result ={};
        for (int each : array) {
            if (!ArraysUtility.contains(result, each)){
                result =ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }


}
