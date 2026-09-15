package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άθροισμα των 10 πρώτων ακεραίων, δλδ από το 1 εώς το 10:
 * Δλδ: 1 + 2 + 3 + .... + 9 + 10 = ?
 */
public class SumMultiplication10 {
    public static void main(String[] args) {
        // Define and Initialise variables
        int i = 1;
        int j = 1;
        int sum = 0;
        int multipl = 1;

        //Perform logic operations
        while (i <= 10){
            sum += i;
            i++;
        }

        while (j <= 10){
            multipl *= j;
            j++;
        }

        // Display result
        System.out.println("The sum of the first 10 numbers is: " + sum);
        System.out.printf("The product of the first 10 numbers is: %,d",  multipl);
    }
}
