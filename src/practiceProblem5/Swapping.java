package practiceProblem5;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the value of num1:");
    int num1 = scanner.nextInt();
    System.out.println("Enter the value of num2");
    int num2 = scanner.nextInt();

    System.out.println("Before swapping:");
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);

    int temp = num1;
    num1 = num2;
    num2 = temp;

    System.out.println("After swapping:");
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
}
}

