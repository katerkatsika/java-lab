package gr.aueb.cf.ch3;

/**
 * Δίνεται η αρχική τιμή, η τελική τιμή και το βήμα αύξησης.
 * Το πρόγραμμα υπολογίζει το πλήθος των επαναλήψεων.
 */
public class GenericWhileApp {

    public static void main(String[] args) {

        // Define and initialse variables
        int start = 1;
        int stop = 10;
        int step = 2;
        int iterations = 0;

        //Perform logic operations
        while (start <= stop){
            iterations ++;
            start += step;
        }

        //Display result
        System.out.println("Number of iterations = " + iterations);
    }
}
