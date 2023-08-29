package practiceproblem2;

import java.util.Scanner;

public class ReverseNumber2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
    System.out.print("Enter a number "  );
    int input = Scanner.nextInt();

    int sum = 0;



    for( int i = 0;input > 0;i++) {

        sum = (sum * 10) + (input % 10);
        input = input / 10;

    }

    System.out.println("reversed number is   " + sum);


}


}


