package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Θα εκφράζουμε τη λογική if - then - else
 * με linear τρόπο ελέγχοντας πρώτα (στην αρχή του κώδικα)
 * τις failure/error συνθήκες (conditions).
 */
public class   SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        final int SECRET_KEY = 10;

        System.out.println("Please insert an integer: ");
        inputNum = scanner.nextInt();

        if (inputNum != SECRET_KEY) {
            System.out.println("Failed.");
            System.exit(1);   // Αυτή εδώ η εντολή τερματίζει το πρόγραμμα και δεν πάει παρακάτω.
        }

        System.out.println("Secret number was found!!!");

        scanner.close();
    }
}
