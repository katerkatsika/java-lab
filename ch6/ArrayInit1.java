package gr.aueb.cf.ch6;

/**
 * Δήλωση και αρχικοποίηση ενός απλού
 * πίνακα στη Java.
 */
public class ArrayInit1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 12;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 4;
        arr[4] = 51;

        System.out.println("1st element: " + arr[0]);
        System.out.println("Array length: " + arr.length);
        System.out.println("Last element: " + arr[arr.length - 1]);

    }


}
