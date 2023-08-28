package practiceproblem2;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number n: ");
    int num = scanner.nextInt();
    int i = 0,sum = 0;
    while (i<= num) {

        sum = sum + i;

        i++;
    }


    System.out.println("Sum Of n Natural Numbers is= " + sum);
}
}

}
