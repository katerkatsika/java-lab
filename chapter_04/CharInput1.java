package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 * Char input as byte
 * (so only latin characters)
 */
public class CharInput1 {

    public static void main(String[] args) throws IOException {
        int inputChar = 'A';

        System.out.println("Παρακαλώ εισάγετε έναν χαρακτήρα: ");
        inputChar = System.in.read(); // επιστρέφει ακέραιο, έναν small int
                                      // (H read - όπως και η write - είναι low level μέθοδος στη Java.
                                      // Διαβάζει 1 μόνον byte. Άρα μόνον latin, άρα μόνον ASCII. δε μπορεί
                                      // να διαβάσει surrogate.

        System.out.printf("char: %d \n", inputChar);
        System.out.printf("char: %c, ordinal: %d \n", inputChar, inputChar);


    }
}
