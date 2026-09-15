package gr.aueb.cf.ch6;

/**
 * Finds the min (or max respectively) of a given array
 * comparing the first element with the second,
 * then the second with the 3rd and so on
 * (the i-th element with the (i +1) element.
 */
public class ArrayMinAndMax {

    public static void main(String[] args) {
        // Define the input array
//        int[] arr = new int[] {22, 37, 43, -2, 52, 210, 0, 3, 23};
        int[] arr = {};

        // Find min value and position
        int min = findMinValue(arr);
        int minPosition = findMinPosition(arr);

        // Find max value and position
        int max = findMaxValue(arr);
        int maxPosition = findMaxPosition(arr);


        //Print the results
        System.out.println("Array's length = " + arr.length);
        System.out.println("min value = " + min + " at position: " + minPosition);
        System.out.println("max value = " + max + " at position: " + maxPosition);
    }

    public static int findMinValue(int[] sourceArray) {
//        if (sourceArray == null || sourceArray.length < 1) {
//            System.out.println("Array is not valid/populated");
//            return 0;
//        }
        // throw new IllegalArgumentException(...) is perfectly legal and better practice,
        //because a throw statement terminates the method, and the compiler
        // doesn’t expect a return afterward.
        if (sourceArray == null || sourceArray.length < 1) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int min = sourceArray[0];
        for (int i = 1; i < sourceArray.length; i++) {
            if (sourceArray[i] < min) {
                min = sourceArray[i];
            }
        }
        return min;
    }

    public static int findMinPosition(int[] sourceArray) {
        if (sourceArray == null || sourceArray.length < 1) return -1;

        int minPosition = 0;
        for (int i = 1; i < sourceArray.length; i++) {
            if (sourceArray[i] < sourceArray[minPosition]) {
                minPosition = i;
            }
        }
        return minPosition;
    }

    public static int findMaxValue(int[] sourceArray) {
        if (sourceArray == null || sourceArray.length < 1) return 0;

        int max = sourceArray[0];
        for (int i = 1; i < sourceArray.length; i++) {
            if (sourceArray[i] > max) {
                max = sourceArray[i];
            }
        }
        return max;
    }

    public static int findMaxPosition(int[] sourceArray) {
        if (sourceArray == null || sourceArray.length < 1) return -1;

        int maxPosition = 0;
        for (int i = 1; i < sourceArray.length; i++) {
            if (sourceArray[i] > sourceArray[maxPosition]) {
                maxPosition = i;
            }
        }
        return maxPosition;
    }

}










