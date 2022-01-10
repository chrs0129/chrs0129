package day16_FerLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo12345School !@#%WoodenSpoon";
        String digits = "";
        String letters = "";
        String specChar = "";
        for (int i = 0; i <= str.length() -1; i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9'){
                digits += ch;
            }else if (ch >= 'A' && ch <= 'Z'|| ch >= 'a' && ch <= 'z'){
                letters += ch + " ";
            }else { if (ch != ' '){
                specChar += ch;}
            }

        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specChar);
    }
}
