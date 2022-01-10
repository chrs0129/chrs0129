package day33;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Petya");
        Student student2 = new Student("Vasya", 'M');
        Student student3 = new Student("Anya", 'F', 26);
        Student student4 = new Student("Kolya", 'M', 24, 1270, 'B');
        Student[] students = {student1, student2, student3, student4};
        System.out.println(Arrays.toString(students));

    }
}
