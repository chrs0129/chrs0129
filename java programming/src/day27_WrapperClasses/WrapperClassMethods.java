package day27_WrapperClasses;

import java.util.concurrent.Callable;

public class WrapperClassMethods {
    public static void main(String[] args) {


        String str = "12345";
        int num = Integer.parseInt(str);
        System.out.println(num + 1);
        String str2 = "10.5";
        double num1 = Double.parseDouble(str2);
        System.out.println(num1 + 1);
        String s1 = "true";
        boolean b1 = Boolean.parseBoolean(s1);
        String s2 = "123";
        Integer x = Integer.valueOf(s2);
        int y = Integer.valueOf(s2);
        System.out.println("-------------------------");
        // is digit
        char ch1 = '0';
        boolean r2 = Character.isDigit(ch1);
        System.out.println(r2);
        boolean r3 = Character.isLetter(ch1);
        System.out.println(r3);
        boolean r4 = Character.isLetterOrDigit(ch1);
        System.out.println(r4);
        boolean r5 = Character.isUpperCase(ch1);
        System.out.println(r5);
        System.out.println("-----------------------");
        String s ="ab1cde2efg3hi4}";
        int sum =0;

        for( char each :s.toCharArray()){
            if (Character.isDigit(each)){
                sum= sum + each;
            }

        }
        System.out.println(sum);




    }
}
