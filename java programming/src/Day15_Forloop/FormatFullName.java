package Day15_Forloop;

public class FormatFullName {
    public static void main(String[] args) {
        String firstName = "cyDeo";
        String lastName = "sCHOOL";

        //String str = firstName.substring(0, 1).toUpperCase()  + firstName.substring(1).toLowerCase();
        //System.out.println(str);
        String str1 = ("" + firstName.charAt(0)).toUpperCase() +firstName.substring(1).toLowerCase();
       String str2 = lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(str1 + " " + str2);
    }
}
