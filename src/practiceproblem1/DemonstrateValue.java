package practiceproblem1;

public class DemonstrateValue {
    static int x = 10;
    static int y;
    static void fun(int z) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = "+ z);
    }
    static {
        System.out.println("Running static initialization block.");
        y = x + 5;
    }
    public static void main(String[] args) {
        fun(8);

    }
}

