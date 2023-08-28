package practiceproblem2;

import java.util.Scanner;

public class SumOfNaturalNum2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int num = scanner.nextInt();
        int i = 0,sum = 0;
        for (i=1;i<= num;++i) {

            sum = sum + i;


        }


        System.out.println("Sum Of n Natural Numbers is= " + sum);
    }
}

