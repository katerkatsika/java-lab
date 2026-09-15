package gr.aueb.cf.ch12;

public class Student {
    private int id;
    private String firstname;
    private String lastname;

    // Μπορούμε να ορίσουμε τον default constructor, δλδ την αρχικοποίηση:
    public Student() {
//        id = 0;
//        firstname = null;
//        lastname = null;
    }

//    //Overloaded Constructor
//    public Student(int id, String firstname, String lastname) {
//        this.id = id;
//        this.firstname = firstname;
//        this.lastname =lastname;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;        // this.id refferrs to the Student id. Το σκέτο id αναφέρεται στην παράμετρο
//                             // του setId
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }

    // command + N --> Constructor --> Select All
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
