package gr.aueb.cf.ch6;

/**
 *Διασχίζει (traverse έναν πίνακα. Δλδ επισκέπτεται
 * μία-μία τις θέσεις του πίνακα και εκτυπώνει την τιμή
 * της κάθε θέσης.
 */
public class   ArrayTraverse {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] grades = {1, 2, 3, 4, 5};
        int[] arr3 = new int[] {2, 4, 1, 0, 3};

        // traverse with for:
        for (int i = 0; i <arr1.length; i++) {
            System.out.printf("arr1[%d] = %d \t", i, arr1[i]);
        }
        System.out.println();

        for (int i = 0; i <grades.length; i++) {
            System.out.printf("grades[%d] = %d \t", i, grades[i]);
        }
        System.out.println();

        for (int i = 0; i <arr3.length; i++) {
            System.out.printf("arr3[%d] = %d \t", i, arr3[i]);
        }
        System.out.println();


        //Enhanced for
        for (int item : arr3) {
            //System.out.printf("arr2[%d] = %d \t", item, grades[item]);
            System.out.print(item + " ");
        }

    }
}
