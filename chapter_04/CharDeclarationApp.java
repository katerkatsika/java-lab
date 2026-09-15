package gr.aueb.cf.ch4;

/**
 * Δηλώνει και αρχικοποιεί μεταβλητές τύπου char
 */
public class CharDeclarationApp {
    public static void main(String[] args) {
        char star ='*';
        char alpha = 'A';
        final char EMPTY_CHAR = ' ';

        System.out.printf("\" star = %c, \\ slpha = %c, \t space = '%c' ", star, alpha, EMPTY_CHAR);
    }
}
