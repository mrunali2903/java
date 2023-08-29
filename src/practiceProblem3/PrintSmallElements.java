package practiceProblem3;

public class PrintSmallElements {

    public static void main(String[] args){
        int arr[] = {10, 324, 45, 90, 9808};
        int max = Arrays.stream(arr).min().getAsInt();
        System.out.println("Smallest elements of array " +max);
    }

}


