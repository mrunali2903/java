package practiceproblem1;

public class CountIntegers {
    public static void main(String[] values){
        int sum = 0;
        System.out.println("Calculate Sum for below two integer");
        for(int i=0; i<values.length; i++){
            System.out.println(values[i]);
            sum = sum +Integer.parseInt(values[i]);

        }
        System.out.println("Sum :" + sum);
    }
}

