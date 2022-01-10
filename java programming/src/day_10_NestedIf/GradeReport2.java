package day_10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int s =95;
        String result = (s >=0 && s <+ 100)? (s >= 90)? "Escelent" :(s >= 80)? "Great" :(s >= 70)? "Good"
                :(s >= 60)? "Passed" : "Failed" : "Invalid Score";
        System.out.println(result);
    }
}
