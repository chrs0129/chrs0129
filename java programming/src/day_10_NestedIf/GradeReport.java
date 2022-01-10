package day_10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
/*
90 - 100 : exelent
80 - 89 : great
70 - 79 : good
60 - 69 : passed
0 -59 : failed
 */
        int score = 105;
        String result = "";
        if (score >= 0 && score <= 100 ){
            if (score >= 90){
                 result = "Excelent";
            }else if (score >=80){
                result = "Great";
            }else if (score>=70){
                result = "Good";
            }else if (score >= 60){
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{
            result = "Invalid Score";
        }
        System.out.println(result);
    }
}
