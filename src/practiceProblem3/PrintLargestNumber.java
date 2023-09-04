package practiceProblem3;

import java.util.Arrays;

public class PrintLargestNumber {
    public static void main(String[] args) {
    int arr[] = {10, 324, 45, 90, 9808};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}
