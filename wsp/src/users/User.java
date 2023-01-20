package users;

import java.util.Vector;

import enums.Gender;

public abstract class User {
    private String firstName;
    private String lastname;
    private String login;
    private String password;
    private Gender gender;
    static Vector<User> users = new Vector<>();
    public User(String firstName, String lastname, String login, String password, Gender gender) {
        super();
        this.firstName = firstName;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastname=" + lastname + ", login=" + login + ", password=" + password
            + ", gender=" + gender + "]";
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Gender getGender() {
        return gender;
    }
    public void login(String login, String password) {

    }
    public void logout() {

    }
}