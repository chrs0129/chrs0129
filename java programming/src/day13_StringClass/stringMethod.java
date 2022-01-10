package day13_StringClass;

public class stringMethod {
    public static void main(String[] args) {
        String word = "Cydeo";
        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("----------------------------");
        String s1 = "Batch 25 is the best batch. Java programming language";
int totalChar = s1.length();
        System.out.println(totalChar);
        char lastChar = s1.charAt(s1.length() -1);
        System.out.println(lastChar);
        System.out.println("-----------------------------");
        String str = "wooden spoon";
        str = str.toUpperCase();
        System.out.println(str);
        System.out.println("-------------------------------");
        String s = "JAVA";
        s = s.toLowerCase();
        System.out.println(s);


    }
}