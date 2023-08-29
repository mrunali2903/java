package practiceProblem3;

public class PrintReverseNumber {


    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9};

        int n = arr.length;
        for (int i = n - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}