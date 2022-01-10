package day24_CustumMethodReturn;

public class ReturnStatement {
    public static void nameOfTheMonth(int monthNumber) {
        String name = "";
       if (monthNumber<1 || monthNumber>12){
           System.out.println("Invalid");
           return;
       }
            name = (monthNumber == 1) ? "Jan" : (monthNumber == 2) ? "Feb" : (monthNumber == 3) ? "Mur"
                    : (monthNumber == 4) ? "Apr" : (monthNumber == 5) ? "May" : (monthNumber == 6) ? "Jun" :
                    (monthNumber == 7) ? "Jul" : (monthNumber == 9) ? "Sep" : (monthNumber == 10) ? "Oct" :
                            (monthNumber == 11) ? "Nov" : "dec";



        System.out.println("Month name: " + name);
    }

    public static void main(String[] args) {
      nameOfTheMonth(13);

    }


}
