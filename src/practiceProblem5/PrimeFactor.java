package practiceProblem5;

import java.util.Scanner;

public class PrimeFactor {

}  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    System.out.print("Prime factors of " + number + " are: ");
    computePrimeFactors(number);
}

    public static void computePrimeFactors(int number) {
        for (int i = 2; i * i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

