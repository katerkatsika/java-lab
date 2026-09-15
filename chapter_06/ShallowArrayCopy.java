package gr.aueb.cf.ch6;

/**
 * Όταν κάνουμε copy reference,
 * τότε το copy ονομάζεται swallow
 * και έχει side effects.
 * Το ερώτημα εδώ είναι πως αντιγράφουμε έναν πίνακα.
 */
public class ShallowArrayCopy {

    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3, 4, 5};
        int[] arrayCopy = initialArray;  // Εδώ έχουμε αντιγραφή δεικτών (Reference copy)
        // Αντιγράφουμε δλδ μόνον το δείκτη. ΟΧΙ ΤΙΣ ΤΙΜΕΣ!
        System.out.println(initialArray);
        System.out.println(arrayCopy);

        arrayCopy[0] = 1000;
        System.out.println(initialArray[0]);

    }
}