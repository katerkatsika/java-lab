package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Array copy using Java Utility classes and methods.
 */
public class ArrayCopyWithjavaMethods {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] copiedArray = addDeepCopy(arr);
        System.out.println(Arrays.toString(copiedArray));
    }

    public static int[] addDeepCopy(int[] sourceArray) {
//        int[] destinationArray = new int[10]; //{10, 20, 30, 40, 50};
//        int[] destinationArray = new int[] {10, 20, 30, 40, 50, 60, 70};

//        System.arraycopy(sourceArray, 2, destinationArray, 2, sourceArray.length - 7); // 1st way

        int[] destinationArray;
//        destinationArray = Arrays.copyOf(sourceArray,sourceArray.length - 5);    // 2nd way
        destinationArray = Arrays.copyOfRange(sourceArray, 2, sourceArray.length + 10);        // 3rd way
        return destinationArray;
    }
}
