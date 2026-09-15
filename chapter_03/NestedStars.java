package gr.aueb.cf.ch3;

/**
 * Εμφανίζει 5 σειρές από 10 αστεράκια στη σειρά.
 */
public class NestedStars {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;

        while (j <= 5){

            while (i < j + 10){
                System.out.print("*");
                i++;
            }
            System.out.println();
            j++;
            i = j;
        }

    }
}
