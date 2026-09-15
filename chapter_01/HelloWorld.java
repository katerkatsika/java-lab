package gr.aueb.cf.ch1;

/**
 * Documentation comments: Prints "Hello World"
 * at standars output (στην κονσόλα δλδ)
 */
public class HelloWorld {

    public static void main(String[] args) {

        int[] arr1 = new int[] {0, 1, 2, 3, 4, 5,6};

        printArray(arr1);
    }

    public static void  printArray(int[] arr) {
        arr[0] = 100;
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
