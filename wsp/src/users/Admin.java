package users;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import enums.Gender;
import tools.jsonTool;

public class Admin extends User {

    public Admin(String firstName, String lastname, String login, String password, Gender gender) {
        super(firstName, lastname, login, password, gender);
    }
    public String[] getUserStrings(User user) {
        String[] array = new String[6];
        array[0] = user.getClass().toString();
        array[1] = user.getLogin();
        array[2] = user.getPassword();
        array[3] = user.getFirstName();
        array[4] = user.getLastname();
        array[5] = user.getGender().toString();
        return array;
    }
    public void addUser(User user) throws FileNotFoundException, IOException, ParseException {
        String[] array = getUserStrings(user);
        jsonTool.addUser(array[0], array[1], array[2], array[3], array[4], array[5]);
    }
    public void deleteUser(User user) {
        String[] array = getUserStrings(user);
        jsonTool.deleteUser(array[0], array[1], array[2], array[3], array[4], array[5]);
    }
}
