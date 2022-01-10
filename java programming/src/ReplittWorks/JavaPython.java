package ReplittWorks;

import java.util.Scanner;

public class JavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String str1 ="";
        String str2 = "";
        int count1 = 0;
        int count2=0;
        for (int i = 0; i <sentence.length()-3 ; i++) {
            str1 = sentence.substring(i, i + 4);

            if (str1.toLowerCase().contains("java")) {
                sentence.replaceFirst("java", "");
                count1++;
            }
        }
                for (int j = 0; j < sentence.length() - 5; j++) {

                    str2 = sentence.substring(j, j + 6);
                    if (str2.toLowerCase().contains("python")) {
                        sentence.replaceFirst("python", "");
                        count2++;
                    }

                }


        if (count1 == count2) {
            System.out.println(true);
        }else

    {
        System.out.println(false);
    }









        scan.close();
    }
}
