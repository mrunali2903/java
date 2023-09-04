package practiceProblem5;

import java.util.Scanner;

public class Vowel { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an alphabet: ");
    char alphabet = scanner.next().toLowerCase().charAt(0);

    if (isVowel(alphabet)) {
        System.out.println(alphabet + " is a vowel.");
    } else {
        System.out.println(alphabet + " is a consonant.");
    }
}

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}


