package gr.aueb.cf.ch3;

/**
 * Εμφανίζει 10 αστεράκια στη σειρά - οριζοντίως.
 * Δλδ 1 αστεράκι 10 φορές.
 * Kαι μετά 10 αστεράκια καθέτως.
 */
public class  Stars10App {
    public static void main(String[] args) {
        // Define and initialise variables
        int i = 1;

        // Perform logic operations
        while (i < 11){
            System.out.print("* ");
            i ++;
        }

       System.out.println("\n");

        while (i>=2){
            System.out.println("*");
            i--;
        }
    }
}
