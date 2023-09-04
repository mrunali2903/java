package practiceProblem5;

public class PowerOfTwo {
    public static void main(String[] args) {
    if (args.length == 0) {
        System.out.println("Please provide a power value N as a command-line argument.");
        return;
    }

    int N = Integer.parseInt(args[0]);

    if (N < 0 || N >= 31) {
        System.out.println("Invalid power value. Please enter a value between 0 and 30.");
        return;
    }

    for (int i = 0; i <= N; i++) {
        int powerOfTwo = (int) Math.pow(2, i);
        System.out.println("2^" + i + " = " + powerOfTwo);
    }
}
}

