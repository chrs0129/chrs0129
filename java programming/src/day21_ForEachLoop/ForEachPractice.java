package day21_ForEachLoop;

public class ForEachPractice {
    public static void main(String[] args) {
        String[] words = {"Java Programming", "Cydeo School", "Early Birds", "Angry birds"};
        for (String each : words) {
            System.out.println(each.charAt(0) + "" + each.charAt(each.length() - 1));

        }
    }
}
