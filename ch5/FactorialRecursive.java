package gr.aueb.cf.ch5;

/**
 * Calculates n! recursively (ΑΝΑΔΡΟΜΙΚΑ δλδ).
 */
public class  FactorialRecursive {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(facto(i));
        }
    }

    public static int facto(int n) {
//        if (n <= 1) return 1;
//        return n * facto(n-1);

        // Ισοδύναμα με το παραπάνω αλλά με τριαδικό τελεστή θα ήταν:
         return (n <= 1) ? 1 : n * facto(n-1);
    }

}
