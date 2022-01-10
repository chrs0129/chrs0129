package ReplittWorks.methods;

import java.util.Scanner;

public class FindError {
    public static boolean isError(String line) {
        if (line.startsWith("error")) {
            return true;
        } else {
            return false;
        }


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isError(in.nextLine()));
        in.close();
    }

}
/*
The isError method checks if the given String begins with error

The method will return true if the String starts with error otherwise it will return false
Example:

isError("foo bar")
​
returns : false
isError("foo bar")

returns : false
isError("error foo bar")
​
returns : true
isError("error foo bar")

returns : true
isError("error one two")
​
returns : true
isError("error one two")

returns : true
isError("three four error")
​
returns : false
 */