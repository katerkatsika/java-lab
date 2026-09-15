package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Αναζητά το 1ο στοιχείο σε έναν πίνακα
 * και επιστρέφει την ΠΡΩΤΗ θέση του στοιχείου αυτού στον πίνακα
 * ή επιστρέφει -1 αν δεν υπάρχει στον πίνακα καθόλου.
 */
public class ArraySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int element;
        int[] arr = {1, 2, 3, 4, 5, 3, 7};

        System.out.println("Please enter the element value: ");
        element = scanner.nextInt();

        System.out.printf("Element was found in position: " + elementCheck(element, arr));

    }

    /**
     * Επιστρέφει το 1ο στοιχείο του πίνακα που ισούται με το element
     * που εισάγει ο χρήστης. Αν δεν υπάρχει το πρόγραμμα επιστρέφει -1.
     * @param element The is entered by the user
     * @param arr The array
     * @return it returns the position
     */
    public static int elementCheck(int element, int[] arr) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
