package Homework;

public class SalaryCalculator {
    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public double weeklyHour;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHour) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHour = weeklyHour;
    }

       public double salary (){
        return 52*weeklyHour*hourlyRate;
       }


        public double stateTax() {
            return 52*weeklyHour*hourlyRate * stateTaxRate / 100;
        }
        public double federalTax(){
        return 52*weeklyHour*hourlyRate*federalTaxRate/100;
        }
        public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
        }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHour=" + weeklyHour +
                ", Salary after tax=" + salaryAfterTax() +
                '}';
    }
}

/*
SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */