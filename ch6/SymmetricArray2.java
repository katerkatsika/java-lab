package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Finds if a given array of integers is symmetric or not.
 * CF8 solution
 */
public class SymmetricArray2 {
    public static void main(String[] args) {
        int[] arr1 =  {9, 3, 2, 4, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int[] arr3 = {};

        System.out.println(Arrays.toString(arr1) +  " -> is symmetric: " + isSymmetric(arr1));
        System.out.println(Arrays.toString(arr2) +  " -> is symmetric: " + isSymmetric(arr2));
        System.out.println(Arrays.toString(arr3) +  " -> is symmetric: " + isSymmetric(arr3));
    }

    public static boolean isSymmetric(int[] arr) {
        if (arr == null || arr.length == 0) {
            //throw new IllegalArgumentException("Array is null or empty");
            System.out.println("Array is null or empty!");
            return false;
        }
        boolean isSymmetric = true;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }
}
