package practiceProblem5;

import java.util.Scanner;

public class CoinFlip { public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of value of flips:" );
       int numFlips = scanner.nextInt();

       if (numFlips <= 0) {
           System.out.println("Invalid number of flips. Please enter a positive integer.");
            return;
       }

        Random random = new Random();
       int numHeads = 0;
        int numTails = 0;

//        for (int i = 0; i < numFlips; i++) {
//            double randomValue = random.nextDouble();
//
//            if (randomValue < 0.5) {
//                numTails++;
//            } else {
//                numHeads++;
//            }
//        }
//
//        double percentageHeads = (double) numHeads / numFlips * 100;
//        double percentageTails = (double) numTails / numFlips * 100;
//
//        System.out.println("Number of flips: " + numFlips);
//        System.out.println("Percentage of heads: " + percentageHeads);
//        System.out.println("Percentage of tails: " + percentageTails);
//    }
//}
//
//
//

}
