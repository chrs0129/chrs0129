package ReplittWorks;

public class ExtructNum {
    public static String extractNum(String s){
        String result ="";
        char[] arr =s.toCharArray();
        for (char each :arr){
            if ((Character.isDigit(each))){
                result+=each;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
    }
}
