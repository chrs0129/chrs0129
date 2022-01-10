package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Vasya", 'M', 32, 100000);
        System.out.println(employee1);
        employee1.setAge(34);
        System.out.println(employee1);
        Employee employee2 =new Employee("Galya", 'F', 30,120000);
        System.out.println(employee2);
        employee2.setSalary(employee2.getSalary()+20000);
        System.out.println(employee2);
    }
}