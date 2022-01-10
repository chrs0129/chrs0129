package ReplittWorks;

public class MergeString {
    public static void main(String[] args) {

    }
    public static String mergeString(String one, String two){
        String result ="";

        for (int i = 0, j=0; i <one.length()&& j<two.length() ; i++, j++) {
            result += "" + one.charAt(i) + two.charAt(j);

        }
       return result;
    }
}
/*
Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one. Please note one and two can be of different lengths.

Examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"
s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"
mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
​
mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */