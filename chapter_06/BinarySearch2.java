package gr.aueb.cf.ch6;

/**
 * Ψάχνουμε τη θέση ενός στοιχείου σε ταξινομημένη λίστα.
 * CF8 solution
 */
public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 12, 23, 41, 49, 52, 84, 91};
        int value = 92;

        System.out.println("array length = " + arr.length);
        int valuePosition = binarySearch(arr, value, 0, arr.length -1);
        System.out.printf("%d is at position %d ", value, valuePosition);
    }

    public static int binarySearch(int[] array, int value, int low, int high) {
        if (array == null) return -1;
        if (low < 0 || high > array.length - 1) return -1;
        if (low > high) return -1;

        int medium = (low + high) / 2;

        if (array[medium] == value) return medium;
        else if (array[medium] < value) {
            return binarySearch(array, value, medium + 1, high);
        } else {
            return binarySearch(array, value, low, medium -1);
        }
    }
}
