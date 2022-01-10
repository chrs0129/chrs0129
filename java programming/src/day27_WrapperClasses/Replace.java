package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
 replaceElement(arr, 2,30);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] replaceElement(int[] array, int index, int newElement){

        array[index] =newElement;
        if (index>=0 && index> array.length-1){
            System.err.println("Invalid index; " + index);

        }
        return array;

    }
}
/*
1. Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}
 */