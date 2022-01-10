package ReplittWorks;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str1 = "Java Java java petya";
        int count = 0;

        for (int i = 0; i <= str1.length()-4; i++) {
            if(str1.substring(i,i+4).equalsIgnoreCase("Java") ){
                count++;
            }
        }
        System.out.println(count);
    }
}



