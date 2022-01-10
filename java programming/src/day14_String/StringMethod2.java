package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java" , "Python" );
        System.out.println("str = " + str);
        System.out.println("str2 =" + str2);
        String email = "JohnSmith@yahoo.com";
        String email1 = email. replace("yahoo" , "google");
        System.out.println("email " + email);
        System.out.println("email1 " + email1);
        String sentence = "Java Java Python Python C# C++ Python Python Python Python ";
        String sentence1 = sentence.replace("Python " , "");
        System.out.println("sentence " + sentence);
        System.out.println("sentence1 " + sentence1);
String s = "Dog Dog Dog Dog";
String s2 = s.replace("Dog" , "Cat");
        System.out.println(s);
        System.out.println(s2);

String s3 = "C# is fun, C# is cool";
String s4 = s3.replace(" C#", " Java");
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("-----------------------------------");
        String result = "Java Java Java";
     String result1 = result.replaceFirst("Java", "Python");
        System.out.println(result);
        System.out.println(result1);






    }
}
