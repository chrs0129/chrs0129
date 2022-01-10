package Day20_Array;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];
        for (char i='A', j=0 ; i <='Z'&& j<26 ; i++, j++) {
            letters[j]=i;


        }

        System.out.println(Arrays.toString(letters));

    }
}
