package day17_While_DoWhile;

import java.util.Locale;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {


        String str = " java, java, java, puthon, python";
        int frecuency = 0;
        while (str.contains("java")) {
 str = str.replaceFirst("java", "");
            frecuency++;
        }
        System.out.println(frecuency);
        System.out.println("-------------------------");

        String s = "java java java java python python";
        int countJava = 0;
        int countPython = 0;
        while ((s.contains("java") || s.contains("python"))){
            if (s.contains("java")){
                s = s.replaceFirst("java", "");
            countJava++;
            }
            if (s.contains("python")){
                s= s.replaceFirst("python", "");
            }
            System.out.println(countJava);
            System.out.println(countPython);
        }

    }

}