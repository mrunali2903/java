package practiceProblem3;

import java.util.Arrays;

public class PrintLargestNumber {
    public static void main(String[] args) {
    int arr[] = {10, 324, 45, 90, 9808};
        Arrays Arrays;
        int max = Arrays.stream(arr).max().getAsInt();
    System.out.println("Largest element of array " + max);

}
}


