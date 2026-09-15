package gr.aueb.cf.ch12;

public class UserMain {

    public static void main(String[] args) {

        User user = new User(1L, "George", "Alexandrou", "george21", "galex123",true);

        user.setPassword("NewPassword##");

        System.out.printf("id = %d, username = %s, password = %s " , user.getId(), user.getUsername(), user.getPassword());




    }
}
