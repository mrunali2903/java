package practiceproblem2;

import java.util.Scanner;

public class Palindrome {
    public static <ReverseNumber> void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number");
    int input = scanner.nextInt();

    ReverseNumber reverseNumber = new ReverseNumber();

    int Num = reverseNumber.ReverseNumber(input);

    if(input == Num) {

        System.out.println("the number palindrome number");
    }else {
        System.out.println("the number is not palindrome");

    }






}
}


