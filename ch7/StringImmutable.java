package gr.aueb.cf.ch7;

/**
 * Strings are cached on SCP (String Constant Pool) or
 * Intern Area for efficiency (αυτό το κάνει η Java για να μη σπαταλάει χώρο).
 * Για να μπορέσει αυτό να γίνει με συνεπή και ασφαλή τρόπο, τα
 * strings είναι immutable (meaning unchangeable).
 */
public class StringImmutable {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = s1;

        s2 = "Factory";
        System.out.println(s1);
        System.out.println(s2);
    }
}
