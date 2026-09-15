package gr.aueb.cf.ch6;

/**
 * Βρίσκει το min και το max ενός array,
 * υποθέτοντας ότι το αρχικό min είναι το MAXINT (: Integer.MAX_VALUE)
 * και το αρχικό max είναι το MININT (: Integer_MIN_VALUE)
 */
public class ArrayMinAndMax2 {

    public static void main(String[] args) {
//        int[] arr = new int[]{34, 432, 54, 876, 12, 65, 90};
        int[] arr = {};
        int minValue  = findMinValue(arr);
        int minPosition = findMinPosition(arr);
        int maxValue  = findMaxValue(arr);
        int maxPosition = findMaxPosition(arr);

        System.out.printf("min = %d at position %d \n", minValue, minPosition);
        System.out.printf("max = %d and at position %d \n", maxValue, maxPosition);
    }

    public static int findMinValue(int[] sourceArray) {
        if (sourceArray == null || sourceArray.length < 1) {
            System.out.println("Array is not valid/populated");
            return 0;
        }

        int minValue = Integer.MAX_VALUE;
        for (int element : sourceArray) {
            if (element < minValue) {
                minValue = element;
            }
        }
        return minValue;
    }

    public static int findMinPosition(int[] sourceArray) {
//        if (sourceArray == null || sourceArray.length < 1) return -1;

        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] < minValue) {
                minPosition = i;
                minValue = sourceArray[i];
            }
        }
        return minPosition;
    }

    public static int findMaxValue(int[] sourceArray) {
//        if (sourceArray == null || sourceArray.length < 1) return 0;

        int maxValue = Integer.MIN_VALUE;
        for (int element : sourceArray) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    public static int findMaxPosition(int[] sourceArray) {
//        if (sourceArray == null || sourceArray.length < 1) return -1;

        int maxValue = Integer.MIN_VALUE;
        int maxPosition = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] > maxValue) {
                maxPosition = i;
                maxValue = sourceArray[i];
            }
        }
        return maxPosition;
    }
}


