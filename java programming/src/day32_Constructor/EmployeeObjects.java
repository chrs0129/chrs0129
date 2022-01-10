package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Aaron");
        Employee employee2 = new Employee("Yulia", "F");
        Employee employee3 = new Employee("Vasya", "M", "SDET");
        Employee employee4 = new Employee("Petya", "M", "SDET", 115000);
        System.out.println(employee4);
    }
}
