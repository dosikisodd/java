package Comparators;

import java.util.Comparator;

import users.User;

public class NameComparator implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        String fullName1 = u1.getFirstName() + " " + u1.getLastname();
        String fullName2 = u2.getFirstName() + " " + u2.getLastname();
        return fullName1.compareTo(fullName2);
    }
    
}
