package gr.aueb.cf.ch7;

/**
 * Δήλωση και αρχικοποίηση (populate)
 * μίας {@link String}
 * (της κλάσης String δλδ)
 */
public class StringInIt {

    public static void main(String[] args) {
        String s = "Athens";
        String str = new String("University");
        System.out.println(s);
        System.out.println("Length: " + s.length());
        System.out.println(str);
        System.out.println("Length: " + str.length());
        System.out.println(str.charAt(1));
        System.out.printf("City: %s, Institution: %s", s, str);

    }
}



