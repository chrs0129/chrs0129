package day24_CustumMethodReturn;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
String str1=grade(96);

if (str1.equals("A")){
    System.out.println("Excelent");
}else if (str1.equals("B") ){
    System.out.println("Great");
}else if (str1.equals("C")){
    System.out.println("Good");

}else if (str1.equals("D")){
    System.out.println("Passe");
}else {
    System.out.println("try again");
}
    }
    public static String grade(int score){
        String result = "";
        if (score<0||score>100){
            System.out.println("Invalid");
        }else {
            result=(score>=80)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?
                    "D":"F";

        }
return result;

    }
}
