package gr.aueb.cf.ch6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Κάνουμε shift τις τιμές ενός πίνακα.
 * Είτε προς τα δεξιά είτε προς τα αριστερά.
 */
public class ArrayCircularRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 =  {2, 9, 5, 14, 7, 11, 22, 21, 26, 32};
        int[] arr2 = {9, 1, 3, 5, 7, 11, 41, 53, 37};
        int[] arr3 = {2, 4, 6, 8, 12, 42, 51};
        int[] arr4 = {0, 1, 2, 3, 4, 5, 6};
        int[] arr5 = {};
        int offset = 0;
        int appliedOffset = 0;

        // Give the offset
        System.out.println("Please enter the offset: ");
        offset = scanner.nextInt();

        System.out.println("Initial array: " + Arrays.toString(arr4));
        // Shift to the Right
        int[] rightShiftedArray = shiftedRightBy(arr4, (offset % arr4.length));
        System.out.println(" Right Shifted array: " + Arrays.toString(rightShiftedArray));

        System.out.println();

        // Shift to the left
        int[] leftShiftedArray = shiftedLeftBy(arr4, (offset % arr4.length));
        System.out.println(" Left Shifted array: " + Arrays.toString(leftShiftedArray));

    }

    public static int[] shiftedRightBy(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] shiftedArray = new int[arr.length];

//        offset = offset % arr.length;
        System.out.println("arr length = " + arr.length);
        System.out.println("applied offset = " + offset);

        for (int i = 0; i < arr.length; i++) {
            int j = (i + offset) % arr.length;
            shiftedArray[j] = arr[i];
        }
        return shiftedArray;
    }

    public static int[] shiftedLeftBy(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];
        int[] leftShiftedArray = new int[arr.length];

//        System.out.println("Initial offset: " + offset);
//        offset = offset % arr.length;
        System.out.println("arr length = " + arr.length);
        System.out.println("applied offset = " + offset);

        for (int i = 0; i < arr.length; i++) {
            int j = (i - offset + arr.length) % arr.length;
            leftShiftedArray[j] = arr[i];
        }
        return leftShiftedArray;
    }
}



























