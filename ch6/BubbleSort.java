package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 *  * Orders the elements of an array from smaller numbers to bigger numbers
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 12, 9, 31, 21, 8, 5};
//        int[] arr = {7, 12, 9, 3, 21, 14, 15, 8, -1, 41, 5, 1};

        if (arr == null || arr.length < 1) {
            throw new IllegalArgumentException("The array is null or empty!");
        }

        System.out.println("arrays length = " + arr.length);

        int[] sortedArray = bubbleSort(arr);
        System.out.println("Final sorted array: ");
        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length -1; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {
                System.out.printf("%d,%d: ", j, i);
                System.out.println(Arrays.toString(arr));
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i]= temp;
    }
}
