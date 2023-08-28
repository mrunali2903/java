package practiceproblem2;

import java.util.Scanner;

public class ArithmaticOperator {
    public static void main(String[] args) {

     Scanner Scanner = new Scanner(System.in);


    System.out.print("Enter the first number: ");
    double a = Scanner.nextDouble();

    System.out.print("Enter the second number: ");
    double b = Scanner.nextDouble();

    System.out.println("Enter the third number : ");
    double c = Scanner.nextInt();

    double max = Math.max(a, b);
    double min = Math.min(a, b);

    double result1 = a + b * c;
    double result2 = c + a / b;
    double result3 = a % b + c;
    double result4 = a * b + c;

    System.out.println("Maximum of the two numbers: " + max);
    System.out.println("Minimum of the two numbers: " + min);
    System.out.println("Result of a + b * c: " + result1);
    System.out.println("Result of c + a / b: " + result2);
    System.out.println("Result of a % b + c: " + result3);
    System.out.println("Result of a * b + c: " + result4);

}
}



