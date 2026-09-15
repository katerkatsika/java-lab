package gr.aueb.cf.ch4;

/**
 * Prints 10 lines with stars:
 * 1st has 10 stars.
 * 2nd line has 9 stars
 * ....
 * 10th line has 1 star.
 */
public class StarsDescending10 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
