package practiceproblem2;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value");
        char z = scanner.nextLine().charAt(0);

        switch (z){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(" this character is vowel" +z);
                break;

            default:
                System.out.println(" this character is not vowel" +z);

        }


    }
}

