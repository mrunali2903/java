package practiceProblem3;

import java.util.Arrays;

public class PrintSmallElements{
    public static void main(String[] args){
        int arr[] = {10, 324, 45, 90, 9808};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Smallest element present in given array: " + min);
    }
}
