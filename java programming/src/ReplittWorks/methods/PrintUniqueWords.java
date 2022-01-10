package ReplittWorks.methods;

import java.util.Scanner;

public class PrintUniqueWords {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    scan.close();
    }


    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        for (String each : words) {
            int count=0;
            for (String element : words) {
                if(each.equals(element)){
                    count++;
                }

            }
            if (count==1) {
                System.out.println(each);
            }




        }

    }
}

