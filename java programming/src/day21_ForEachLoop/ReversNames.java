package day21_ForEachLoop;

public class ReversNames {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Adam Smith", "Jane Austen", "Arthur Doyle", "Charles Dickens", "Edgar Poe"};
        for (String each : names) {
            String reversed = "";
            for (int i = each.length() - 1; i >=0; i--) {
                reversed += each.charAt(i);

            }
            System.out.println(reversed);
        }

    }
}
