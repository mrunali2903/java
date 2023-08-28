package practiceproblem2;

import java.util.Scanner;

public class ReverseNumber {
    public int reverseNumber(int input){
    int sum = 0;


    while (input > 0) {
        sum = (sum * 10) + (input % 10);
        input = input / 10;
    }

    return sum;
}
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a number" );
        int input = Scanner.nextInt();

        ReverseNumber reverseNumber =new ReverseNumber();


        int sum = reverseNumber.reverseNumber(input);


        System.out.println("reversed number " + sum);

    }


}


