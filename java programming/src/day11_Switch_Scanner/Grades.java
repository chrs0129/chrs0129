package day11_Switch_Scanner;

public class Grades {
    public static void main(String[] args) {
        char grade = 'E';
        String graeMeaning = "";
        switch (grade) {
            case 'A':
                graeMeaning = " - Exselent";
                break;
            case 'B':
                graeMeaning = " - Good Job";
                break;
            case 'C' :
                graeMeaning = " - Good";
                break;
            case 'D' :
                graeMeaning = " - Passed";
                break;
            case 'F' :
                graeMeaning = " - Failed";
                break;
            default:
                graeMeaning = " - Invalid Input";
        }
        System.out.println(grade + graeMeaning);
    }
}
