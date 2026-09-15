package gr.aueb.cf.ch3;

/**
 * Boolean as conditional expressions.
 */
public class BoolApp {

    public static void main(String[] args) {
        // Define and initialize variables
        boolean isEven = false;
        boolean isOdd = false;
        boolean isHot = false;
        int num = 101;
        int temp = 39;

        // Logic operations
        isEven = num % 2 == 0;
        isOdd = num % 2 != 0;
        isHot = temp >= 40;

        // Display output/results
        System.out.println();
        System.out.println("Is the given number even? " + isEven);
        System.out.println("Is the given number odd? " +isOdd);
        System.out.println("Is it hot today? " + isHot);
    }
}
