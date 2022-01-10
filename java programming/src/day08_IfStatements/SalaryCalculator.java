package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 70,
         weeklyHours = 40;
        double stateTaxRate = 0.065,
                federalTaxRate = 0.26;
        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate;
        double  federalState = salaryBeforeTax * federalTaxRate;
        double totalTax = stateTax + federalState;
        double salaryAfterTax = salaryBeforeTax - totalTax;
        System.out.println("Gross pay :" + salaryBeforeTax);
        System.out.println("State tax :" + stateTax);
        System.out.println("Federal tax: " + federalState);
        System.out.println("total tax : " + totalTax);
        System.out.println("Total income: " + "$" + salaryAfterTax);







    }





}
