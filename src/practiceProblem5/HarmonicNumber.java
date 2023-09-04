package practiceProblem5;

public class HarmonicNumber {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the harmonic value N as a command-line argument.");
        }

        int N = Integer.parseInt(args[0]);

        if (N == 0) {
            System.out.println("Invalid harmonic value. N should be a non-zero positive integer.");

        }

        double harmonic = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonic += 1.0 / i;
        }

        System.out.println("The " + N + "th Harmonic Value is: " + harmonic);
    }
}

