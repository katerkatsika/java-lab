package gr.aueb.cf.ch6;

/**
 * Array initializer
 */
public class Arrayinit3 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[] {8, 2, 3, 4, 5, 3, 9};

        // or in one line:
        // int[] arr = new int[] {8, 2, 3, 4, 5, 3, 9};

        System.out.println("1st element: " + arr[0]);
        System.out.println("Array length: " + arr.length);
        System.out.println("Last element: " + arr[arr.length - 1]);
    }
}
