package practiceProblem5;

import java.util.Scanner;

public class ReminderQuotient {

 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the value of dividend:");
    int dividend = scanner.nextInt();
    System.out.println("enter the value of divisor:");
    int divisor = scanner.nextInt();

    int quotient = dividend / divisor;
    int remainder = dividend % divisor;

    System.out.println("Dividend: " + dividend);
    System.out.println("Divisor: " + divisor);
    System.out.println("Quotient: " + quotient);
    System.out.println("Remainder: " + remainder);
}
}
