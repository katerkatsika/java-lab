package gr.aueb.cf.ch6;

public class ArrayReferenceDemo {
    public static void main(String[] args) {
        // Create an array
        int[] numbers = {10, 20, 30, 40, 50};

        // The reference 'numbers' points to the ENTIRE array
        System.out.println(numbers); // Something like [I@1b6d3586

        // Copy the reference (not the array)
        int[] numbersCopy = numbers;

        // Both references point to the SAME array
        numbersCopy[0] = 99;

        System.out.println(numbers[0]);     // 99 - original changed!
        System.out.println(numbersCopy[0]); // 99

        // Prove they're the same object
        System.out.println(numbers == numbersCopy); // true - same reference
    }
}