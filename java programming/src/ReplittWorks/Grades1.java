package ReplittWorks;

import java.util.Scanner;

public class Grades1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        if (score >= 90 && score<= 100){
            System.out.println("excellent");
        }else if (score >= 70 && score < 90){
            System.out.println("good");
        }else if (score >= 60 && score < 70){
            System.out.println("pass");
        }else if(score > 0 && score < 60){
            System.out.println("fail");
        }


s.close();
    }
}
/*
Write a program that takes the **grade** int and prints if it's a passing grade or failure.

- if grade is equal or greater than 90 output "excellent"
- if the grade is equal or greater than 70 and less then 90 output "good"
- if grade is greater than 60 and less than 70 output "pass"
- if grade is lessr than 60 output "fail"

Examples:

```
93

excellent
```

```
46

fail
```

```
80

good
```
 */