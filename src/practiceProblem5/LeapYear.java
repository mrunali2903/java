package practiceProblem5;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);

    System.out.print("Enter a year (4-digit number): ");
    int year = Scanner.nextInt();

    if (year < 1000 || year > 9999) {
        System.out.println("Invalid year. Please enter a 4-digit number.");
        return;
    }

    boolean isLeapYear = false;

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                isLeapYear = true;
            }
        } else {
            isLeapYear = true;
        }
    }

    if (isLeapYear) {
        System.out.println(year + " is a leap year.");
    } else {
        System.out.println(year + " is not a leap year.");
    }
}
}

