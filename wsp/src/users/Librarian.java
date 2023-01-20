package users;

import enums.Gender;

public class Librarian extends Employee {

    public Librarian(String firstName, String lastname, String login, String password, Gender gender, int salary,
            String id) {
        super(firstName, lastname, login, password, gender, salary, id);
    }
    public void beQuiet() {
        System.out.println(getFirstName() + " " + getLastname() + " is being quiet(she is alive tho).");
    }
    public void sayShhh() {
        System.out.println(getFirstName() + " " + getLastname() + " says shhhh");
    }

}
