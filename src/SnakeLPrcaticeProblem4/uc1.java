package SnakeLPrcaticeProblem4;

public class uc1 {
    public static void main(String[] args) {
    int currentPosition = 0;
    int winningSpot = 100;

    System.out.println("Welcome to Snake and Ladder Game!");

    while (currentPosition < winningSpot) {
        int diceNumber = rollDice();

        currentPosition += diceNumber;

        if (currentPosition > winningSpot) {
            currentPosition -= diceNumber;
        }

        currentPosition = checkSnakeAndLadder(currentPosition);

        System.out.println("Current Position: " + currentPosition);
    }

    System.out.println("Congratulations! You reached the winning spot!");
}

    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int checkSnakeAndLadder(int position) {
        int[] snakes = {16, 47, 49, 56, 62, 64, 87, 93, 95, 98};
        int[] ladders = {1, 4, 9, 21, 28, 36, 51, 71, 80};

        for (int i = 0; i < snakes.length; i++) {
            if (position == snakes[i]) {
                position -= position;
                break;
            }
        }

        for (int i = 0; i < ladders.length; i++) {
            if (position == ladders[i]) {
                position += position;
                break;
            }
        }

        return position;
    }
}


