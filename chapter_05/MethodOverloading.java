package gr.aueb.cf.ch5;

/**
 * Demo of method overloading.
 */
public class MethodOverloading {
    public static void main(String[] args) {
    int sum1, sum2, sum3;

    sum1 = add(5,3);
    sum2 = add(1, 7, 8);
    sum3 = add(1L, 15L);

        System.out.printf("sum1 = %d \t sum2 = %d \t sum3 = %d \n",sum1, sum2, sum3);
    }


    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Overloaded version of add.
     * * method name + formal params = method signature
     * Το όνομα μπορεί να μένει ίδιο, αλλά αλλάζουν οι παράμετροι.
     * (όταν λέμε αλλάζουν οι παράμετροι, μπορεί να αλλάζει το πλήθος τους,
     * αλλά μπορεί να αλλάζει και ο τύπος τους --> δες επόμενη μέθοδο).
     * Οπότε αλλάζει και η υπογραφή (δεν είναι πλέον η ίδια!)
     * Και αυτή η μέθοδος, εφόσον έχει το ίδιο όνομα, ονομάζεται υπερφορτωμένη.
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Και αυτή είναι overloaded!
     * @param a
     * @param b
     * @return
     */
    public static int add(long a, long b) {
        return (int) (a + b);
    }

}
