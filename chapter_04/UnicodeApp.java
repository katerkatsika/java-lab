package gr.aueb.cf.ch4;

/**
 * Demo for surrogate pairs
 */
public class UnicodeApp {

    public static void main(String[] args) {
        int smiley = 0x1F60A;  // Τα code points έχουν 5 χαρακτήρες είναι
                               // ουσιαστικά δύο UTF-16 code units U+D83D U+DE03
                               // και δεν εκτυπώνεται με \ u*****. Χρειάζεται
                               // Character.toChars(codePoint). Είναι μία
                               // wraper κλάση που μετατρέπει το 0x1F60A στην
                               // ακολουθία των δύο UTF-16 code units U+D83D U+DE03.
                               // 0χ***** ξεκινούν οι δεκαεξικοί αριιθμοί

        System.out.println(Character.toChars(smiley));
        System.out.println(Character.toChars(0x1F60A));
        System.out.println(Character.toChars(0x1F642));
        System.out.println("\u263A"); // different smiley face
        System.out.println("\u20ac"); // euro sign
        System.out.println("\u00A9"); // Copyright sign
        System.out.println("\u2103"); // Celsius sign
        System.out.println("\u2109"); // Fahrenheit sign

    }
}
