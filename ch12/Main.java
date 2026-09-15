package gr.aueb.cf.ch12;

public class Main {

    public static void main(String[] args) {

        Student alice = new Student();
        Student bob = new Student(2, "Bob", "Dean");

        alice.setId(10);
        alice.setFirstname("Alice");
        alice.setLastname("Marilu");

        System.out.println("ID = " + alice.getId());
        System.out.println("Firstname = " + alice.getFirstname());
        System.out.println("Lastnema = " + alice.getLastname());

    }

}
