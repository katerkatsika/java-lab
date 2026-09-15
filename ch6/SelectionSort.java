package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Orders the elements of an array from smaller numbers to bigger numbers
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 12, 9, 3, 21, 14, 15, 8, -1, 41, 5, 1};
        int[] arr2 = {7, 12, 9, 3, 21, 14};

        if (arr == null || arr.length < 1) {
            throw new IllegalArgumentException("The array is null or empty!");
        }

        System.out.println("arrays length = " + arr.length);
        Arrays.sort(arr2);
        System.out.println("arr2: " + Arrays.toString(arr2));

        int[] sortedArray = selectionSort(arr);
        System.out.println("Final sorted array: ");
        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] selectionSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            int min = Integer.MAX_VALUE;
            int position = 0;
            System.out.printf("%d order itteration \n", j);
            System.out.println(Arrays.toString(arr));
            for (int i = j; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    position = i;
                }
            }
            swap(arr, position, j);
//            int temp = arr[j];
//            arr[j] = arr[position];
//            arr[position]= temp;
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i]= temp;
    }
}
