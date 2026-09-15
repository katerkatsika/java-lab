package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Orders the elements of an array from smaller numbers to bigger numbers
 */
public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {71, 12, 9, 31, 21, 8, 5};

        if (arr == null || arr.length < 1) {
            throw new IllegalArgumentException("The array is null or empty!");
        }

        System.out.println("arrays length = " + arr.length);

        int[] sortedArray = bubbleSort(arr);
        System.out.println("Final sorted array: ");
        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] bubbleSort(int[] arr) {
        for (int subList = arr.length - 1; subList > 0; subList--) {
            System.out.println(Arrays.toString(arr));
            for (int runIndex = 0; runIndex < subList; runIndex++) {
                if (arr[runIndex] > arr[runIndex + 1]) {
                    swap(arr, runIndex, runIndex + 1);
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
