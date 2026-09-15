package gr.aueb.cf.ch6;
import java.util.Arrays;

public class SwapWithArray2 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println("Initial array: " + Arrays.toString(arr));

        swap(arr);
//        System.out.printf("New a = %d and new b = %d \n", arr[0], arr[1]);
        System.out.println("Final array: " + Arrays.toString(arr));
    }

    public static void swap(int[] arr) {
        if (arr.length > 2) return;

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

}


