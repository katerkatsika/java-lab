package gr.aueb.cf.ch4;

/**
 * Prints 10 lines with stars:
 * 1st has 1 star.
 * 2nd line has 2 stars
 * ....
 * 10th line has 10 stars
 */
public class StarsAscending10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
