package SnakeLPrcaticeProblem4;

public class uC4 {
    public static void main(String[] args) {
    int currentPosition = 0;
    int winningSpot = 100;

    System.out.println("Welcome to Snake and Ladder Game!");

    while (currentPosition < winningSpot) {
        int diceNumber = (int) (Math.random() * 6) + 1;

        int option = (int) (Math.random() * 3);

        switch (option) {
            case 0:
                System.out.println("No Play! Stay in the same position.");
                break;
            case 1:
                System.out.println("Ladder! Move ahead by " + diceNumber + " positions.");
                currentPosition += diceNumber;
                break;
            case 2:
                System.out.println("Snake! Move behind by " + diceNumber + " positions.");
                currentPosition -= diceNumber;
                break;
        }

        if (currentPosition > winningSpot) {
            currentPosition -= diceNumber;
        } else if (currentPosition < 0) {
            currentPosition = 0;
        }

        System.out.println("Current Position: " + currentPosition);
    }

    if (currentPosition == winningSpot) {
        System.out.println("Congratulations! You reached the winning spot!");
    } else {
        System.out.println("Oops! You missed the winning spot.");
    }
}
}


