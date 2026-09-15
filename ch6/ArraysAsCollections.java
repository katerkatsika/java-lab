package gr.aueb.cf.ch6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Εδώ βλέπουμε τις κατηγορίες των προβλημάτων των Πινάκων (i.e. Συλλογές δεδομένων δλδ)
 * σε τρεις κατηγορίες¨
 * 1. Filtering
 * 2. Mapping
 * 3. Reducing ή Aggregate methods (+predicates = Boolean methods).
 */
public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr1 =  {2, 9, 5, 14, 7, 11, 22, 21, 26, 32};
        int[] arr2 = {9, 1, 3, 5, 7, 11, 41, 53, 37};
        int[] arr3 = {2, 4, 6, 8, 12, 42};
        int[] arr4 = {};

        // Filtering: Θέλουμε πρώτα να εξάγουμε τους ζυγούς
        int[] arrEven = filterEven(arr1);
        System.out.println(Arrays.toString(arrEven));

        // Mapping: Θέλουμε να επιστρέψουμε πίνακα με τιμές 2-σιες του αρχικού.
        int[] arrDouble = mapToDouble(arr2);
        System.out.println(Arrays.toString(arrDouble));

        // Reducing: Θέλουμε να επιστρέψουμε το άθροισμα όλων των στοιχείων ενός πίνακα.
        int sum = sum(arr3);
        System.out.println("The Sum of all the elements is: " + sum);

        // Reducing: Θέλουμε να επιστρέψουμε τον μέσο όρο των στοιχείων ενός πίνακα.
        double avg = avg(arr3);
        System.out.printf("The average of the elements is: %.3f \n", avg);

        // Reducing: Θέλουμε να επιστρέψουμε τον μέσο όρο των
        // στοιχείων ενός πίνακα --> B' Τρόπος (πιο εύκολος/γρήγορος).
        double avg2 = avg2(arr3);
        System.out.printf("The average of the elements is: %.3f \n", avg2);

        // Predicate: Θέλουμε να δούμε αν έστω και ένα
        // στοιχείο ενός πίνακα είναι άρτιος αριθμός και μετά αν όλα τα
        // στοιχεία του είναι άρτια..
        // At least one even
        boolean anyEven = anyEven(arr1);
        System.out.println(Arrays.toString(arr1) + " has at least one even number: " + anyEven);
        // All even
        System.out.println(Arrays.toString(arr1) + " has all of its elements even: " + allEven(arr1));

        // Predicate: Θέλουμε να δούμε αν ένας πίνακα έχει πάνω
        // από δύο άρτιους αριθμούς. Δλδ. αν έχει από 3 και πάνω.
        System.out.println(Arrays.toString(arr1) + " has more than two even elements : "
                + moreThanTwoEvens(arr1));

        // Predicate: Θέλουμε να δούμε αν υπάρχουν πάνω από 2 διαδοχικοί αριθμοί
        // π.χ. 12, 13, 14. <-- Εδώ είναι 3 διαδοχικοί.
        System.out.println(Arrays.toString(arr1) + " has more than two consecutive elements : "
                + moreThanTwoConsecutives(arr1));

        // Predicate: Θέλουμε να δούμε αν υπάρχουν πάνω από 2 αριθμοί
        // με τον ίδιο λήγοντα.
        System.out.println(Arrays.toString(arr1) + " έχει περισσότερα από 2 στοιχεία με τον ίδιο λήγοντα : "
                + moreThanTwoWithSameEnding3(arr1));


    }


    /////////////////  Methods /////////////////////////

    // Filtering
    public static int[] filterEven(int[] arr) {

        if (arr == null || arr.length == 0) {
//            throw new IllegalArgumentException("Array is null or empty");
            return new int[0];
        }

        int[] arrEven = new int[arr.length];
        int count = 0;

        for (int elem : arr) {
            if (elem % 2 == 0) {
                arrEven[count++] = elem;
//                Η τελευταία σειρά είναι ισοδύναμη με τις επόμενες δύο σειρές
//                arrEven[count] = elem; // Γίνεται η καταχώρηση στη θέση count
//                count++; // Και μετά αυξάνεται κατά 1.§
            }
        }
        return Arrays.copyOf(arrEven, count);
    }

    // Β' Τρόπος
//    public static int[] filterEvenB(int[] arr) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int elem : arr) {
//            if (elem % 2 == 0) {
//                list.add(elem);
//            }
//        }
//
//        // Convert to array
//        return list.stream().mapToInt(i -> i).toArray();
//    }

    // Mapping -- Take double the values
    public static int[] mapToDouble(int[] arr) {
        int[] doubledArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            doubledArray[i] = 2* arr[i];
        }
        return doubledArray;
    }

    // Reducing: find the sum of all the elements
    public static int sum(int[] arr) {
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }

    // Reducing: find the average of all the elements
    public static double avg(int[] arr) {
        double avg = 1;
        double numerator = 0;
        int denominator = 1;

        for (int i = 0; i < arr.length; i++) {
            numerator += arr[i];
            denominator = i + 1;
            avg = numerator / denominator;
        }
        return avg;
    }

    // Reducing: find the average of all the elements - Β' Τρόπος
    public static double avg2(int[] arr) {
        return ((double) sum(arr)) / arr.length;
    }

    // Predicate: Θέλουμε να δούμε αν έστω και ένα
    // στοιχείο ενός πίνακα είναι άρτιος αριθμός.
    public static boolean anyEven(int[] arr) {
        for (int elem : arr) {
            if (elem % 2 == 0) return true;
        }
        return false;
    }

    // Predicate: Θέλουμε να δούμε αν ΟΛΑ τα στοιχεία
    // ενός πίνακα είναι άρτιοι αριθμοί.
    public static boolean allEven(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        for (int elem : arr) {
            if (elem % 2 != 0) return false;
        }
        return true;
    }

    // Predicate: Θέλουμε να δούμε αν ο πίνακας έχει περισσότερο
    // από δύο άρτια στοιχεία. Δλδ. αν έχει από 3 και πάνω.
    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0;
        for (int elem : arr) {
            if (elem % 2 == 0) count++;
            //if count > 2 return true; // Κάνει early exit που το θέλουμε
        }
        // return false;
        return count > 2;
    }

    // Predicate: Θέλουμε να δούμε αν υπάρχουν πάνω από 2 διαδοχικοί αριθμοί
    // π.χ. 12, 13, 14. <-- Εδώ είναι 3 διαδοχικοί.
    public static boolean moreThanTwoConsecutives(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2 ) {
                System.out.println(arr[i] + " and " + arr[i + 1] + " and " + arr[i + 2] + " at initial position: " + i);
                counter++;
            }
        }
        return counter > 0;
    }

    // Predicate: Θέλουμε να δούμε αν υπάρχουν πάνω από 2 αριθμοί σε έναν πίνακα
    // με τον ίδιο λήγοντα αριθμό, π.χ. 7, 17, 37 κλπ. Όχι συνεχόμενοι απαραίτητα.
    // Ακολουθούν 3 τρόποι. Ο 1ος είναι O(n^3) (πολύ απλοϊκός η αλήθεια είναι
    // και δεν ενδείκνυται. Ο 2ος είναι O(n) όπως και ο 3ος και είναι της ίδια λογικής
    // και οι δύο, απλά ο 3ος είναι πιο συμπυκνωμένος. Ουσιαστικά ο 2ος και ο 3ος τρόπος είναι
    // ίδιοι, απλά ο 2ος είναι πιο explicit. O 2oς είναι από ChatGPT, o 3ος είναι από CF8.
    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] % 10 == arr[j] % 10 && arr[j] % 10 == arr[k] % 10) {
                        System.out.println(arr[i] + " and " + arr[j] + " and " + arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean moreThanTwoWithSameEnding2(int[] arr) {
        // Ένας αρχικός έλεγχος του πίνακα:
        if (arr == null || arr.length < 3) {
            System.out.println("Array is null, empty or its size is smaller than 3.");
            return false;
        }

        // Δημιουργούμε έναν νέο πίνακα διάστασης 10 (για κάθε πιθανό λήγοντα από 0-9)
        // όπου θα αποθηκεύουμε πόσες φορές εμφανίζεται ένας αριθμός ως λήγοντας.
        // Στη θέση 0 (δλδ counts[0]) καταχωρούμε πόσα μηδενικά έχουμε.
        // Στη θέση 1 (δλδ counts[1]) καταχωρούμε πόσες φορές έχουμε 1 ως τελευταίο ψηφίο.
        // και ούτω καθεξής..
        int[] counts = new int[10]; // counts για λήγοντες μεταξύ 0-9.
        // Αρχικά όλα τα στοιχεία αυτού του πίνακα είναι μηδενικά.
        System.out.println(Arrays.toString(counts));

        for (int num : arr) {
            int ending = num % 10; // αυτό βρίσκει το τελευταίο ψηφίο, π.χ. αν το num = 17 τότε είναι 7.
            counts[ending]++;  // Εδώ ο πίνακας counts στη θέση 7 (:counts[7])
                               // (που καταχωρεί το πόσα εφτάρια έχουμε) αυξάνει κατά 1 και αποθηκεύεται.

            // Εκτύπωση της τρέχουσας κατάστασης
            System.out.println("Number: " + num + " -> Ending " + ending + " count: " + counts[ending]);

            // Μόλις εμφανιστεί θέση >=3 κάνει early exit με return true;
            if (counts[ending] >= 3) {
                System.out.println("Found at least 3 numbers with ending " + ending);
                return true; // αμέσως μόλις βρούμε 3
            }
        }

        // Αν έχουμε βρει 3 αριθμούς με τον ίδιο λήγοντα, όλα τα επόμενα δεν εκτελούνται.
        // Αυτά εκτελούνται μόνον αν δεν έχει εκτελεστεί το προηγούμενο return true; μέσα στη for.
        // Ξαναεκτυπώνω την counts όπου φαίνεται πόσες φορές έχουμε λήγοντες από 0 εώς 9.
        System.out.println(Arrays.toString(counts));

        // Εκτύπωση ξεψωριστά τα counts για όλους τους λήγοντες στο τέλος.
        System.out.println("Final counts per ending: ");
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Ending " + i + ": " + counts[i]);
        }

        return false;
    }

    public static boolean moreThanTwoWithSameEnding3(int[] arr) {
        int[] endingsCounts = new int[10]; // counts για λήγοντες μεταξύ 0-9.
        for (int elem : arr) {
            if (++endingsCounts[elem % 10] > 2) return true; // Επεξήγηση της γραμμής αυτής.
                                                        // Το στοιχείο του πίνακα στη θέση [elem % 10]
                                                  // ΠΡΩΤΑ αυξάνει κατά 1 και μετά συγκρίνεται με το 2.
        }
        return false;
    }

}















