package gr.aueb.cf.ch2;

import java.util.Random;

/**
 * Προσομειώνει ένα ζάρι. Παράγει δλδ ακέραιους αριθμούς από το 1 εώς το 6.
 */
public class RandomApp {
    public static void main(String[] args) {
        // Define and Initialise variables
        int randomIntegers = 0;

        // Perform logic operations
        randomIntegers = (int) (Math.random() * 6) + 1;

        // Display output/results
        System.out.println(randomIntegers);

    }
}
