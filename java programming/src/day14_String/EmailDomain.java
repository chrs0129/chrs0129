package day14_String;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "Cydeo.School@yahoo.com";
        String domain = email.substring(email.indexOf("@") +1, email.lastIndexOf("."));
        System.out.println(domain);
        System.out.println("--------------------------------------------");
        String str1 ="Java is fun, Java is cool, I love Java";
//Java is fun
        String str2 = str1.substring(0, str1.indexOf(","));
        System.out.println(str2);
        String str3 = str1.substring(str1.indexOf(" J")+1, str1.lastIndexOf(","));
        System.out.println(str3);
        String str4 = str1.substring(str1.indexOf("I"));
        System.out.println(str4);

    }
}
