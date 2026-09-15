package gr.aueb.cf.ch4;

/**
 * for loop runs forever -- idiomatic case.
 */
public class ForeverApp {

    public static void main(String[] args) {
        int count = 0;

        for (;;) {
            System.out.print("Runs forever");
            count++;
            if (count % 20 == 0) System.out.println("\n" + count);
            if (count == 101) break;
        }
        System.out.printf("\nTotal counts = %d", count);
    }
}
