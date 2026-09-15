package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Ψάχνουμε τη θέση ενός στοιχείου σε ταξινομημένη λίστα.
 * My solution.
 */
public class BinarySearch {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {3, 5, 12, 23, 41, 49, 52, 84, 91};
        int value = 65;

        System.out.println("array's ength = " + arr.length);
        int elemPosition = binarySearch(arr, value);
        System.out.println(elemPosition);
    }

    public static int binarySearch(int[] array, int value) {
        if (array == null) return -1;

        System.out.println("Please give low and high: ");
        int low = scanner.nextInt();
        int high = scanner.nextInt();
        if (low < 0 || high > array.length - 1) return -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) return mid;
            else if (array[mid] > value) {
                high = mid -1;
            } else low = mid + 1;
        }
        return -1;
    }
}
