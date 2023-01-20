import tools.jsonTool;
import users.User;
public class App {
    User currentUser;
    public String iterateThroughJson(String login, String password) {
        String role = jsonTool.iterateThroughJson(login, password);
        return role;
    }
    public static void main(String[] args) throws Exception {
        
    }
}
