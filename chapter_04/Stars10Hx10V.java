package gr.aueb.cf.ch4;

/**
 * prints 10 horizontal stars x 10 lines.
 */
public class Stars10Hx10V {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
