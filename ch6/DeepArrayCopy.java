package gr.aueb.cf.ch6;
import java.util.Arrays;

/**
 * Αντιγράφει το περιεχόμενο ενός πίνακα σε έναν άλλον πίνακα.
 * Τα περιεχόμενα στην περίπτωση αυτή είναι primitives.
 * Οπότε έχουμε Deep Copy.
 */
public class  DeepArrayCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Initial Array: " + Arrays.toString(arr));

        int[] copyArray = arrayDeepCopy(arr);
        System.out.println("Copied Array: " + Arrays.toString(copyArray));

        changeArrayElement(copyArray);
        System.out.println("Initial Array: " + Arrays.toString(arr));
        System.out.println("Modified Array: " + Arrays.toString(copyArray));

        System.out.println(arr);
        System.out.println(copyArray);

    }

    public static int[] arrayDeepCopy(int[] sourceArr) {
        int[] destinaationArray = new int[sourceArr.length];

        for (int i = 0; i < sourceArr.length; i++) {
            destinaationArray[i] = sourceArr[i];
        }
        return destinaationArray;
    }

    public static void changeArrayElement(int[] sourceArr) {
        sourceArr[0] = 100;
        sourceArr[2] = 300;
    }
}