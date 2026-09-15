package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει για πάντα και όταν βρει τον 'sentinel'
 * διακόπτει το loop. Η διακοπή και έξοδος από μία
 * επαναληπτική δομή γίνεται με break.
 */
public class SentinelApp3 {

    public static void main(String[] args) {

        //Define and Initialise variables
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        // while loop
        while (true) {
            System.out.println("Please enter an integer (exit with -1):");
            num = scanner.nextInt();
            if (num == -1) break;
            iterations++;
        }

        // Display output
        System.out.printf("Number of iterations = %d ", iterations);

    }
}
