package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName = "Safari";
        boolean validBrowser = browserName == "Chrome" || browserName == "Firefox" ||
                browserName == "Opera" || browserName == "Safari" || browserName == "Edge";

        String validBrowse = (browserName == "Chrome") ? "Chrome" : (browserName == "Firefox") ? "Firefox"
                : (browserName == "Opera") ? "Opera" : (browserName == "Safari") ? "Safari"
                : (browserName == "Edge") ? "Edge" : "Invalid";
        System.out.println(browserName + " browser is selected");

    }
}
/*
 Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

2. Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary
 */