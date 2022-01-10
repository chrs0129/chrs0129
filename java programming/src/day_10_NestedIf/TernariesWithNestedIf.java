package day_10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s = 65;
String result = (s >= 0 && s <= 100)? (s >= 90)? "excelent" :(s >= 70 && s <= 79)? "outstanding"
                :(s >= 60 && s <= 69)? "good" :(s >= 50 && s <= 59)? "passed" : "failed" : "invalid";
        System.out.println(result);

    }
}
