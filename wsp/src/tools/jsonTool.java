package tools;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonTool {
    static JSONParser parser = new JSONParser();
    public static JSONArray getJsonArray() {
        JSONArray users = null;
        try {
            JSONObject obj = (JSONObject)parser.parse(new FileReader("D:\\languages\\java\\wsp\\users.json"));
            users = (JSONArray) obj.get("users");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return users;
    }
    public static void addUser(String role, String login, String password, String firstName, String lastName, String gender) throws FileNotFoundException, IOException, ParseException {
        try {
            JSONArray users = getJsonArray();
            JSONObject newObj = new JSONObject();
            newObj.put("role", role);
            newObj.put("login", login);
            newObj.put("password", password);
            newObj.put("firstName", firstName);
            newObj.put("lastName", lastName);
            newObj.put("gender", gender);
            boolean doesExist = false;
            for(int i = 0; i < users.size(); i++) {
                JSONObject cur = (JSONObject) users.get(i);
                if(cur.equals(newObj)) {
                    doesExist = true;
                    break;
                }
            }
            if(!doesExist) {
                System.out.println("Successfully added new user!");
                users.add(newObj);
            }
            JSONObject tmpObj = new JSONObject();
            tmpObj.put("users", users);
            Files.write(Paths.get("D:\\languages\\java\\wsp\\users.json"), tmpObj.toString().getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void deleteUser(String role, String login, String password, String firstName, String lastName, String gender) {
        try {
            JSONArray users = getJsonArray();
            JSONObject newObj = new JSONObject();
            newObj.put("role", role);
            newObj.put("login", login);
            newObj.put("password", password);
            newObj.put("firstName", firstName);
            newObj.put("lastName", lastName);
            newObj.put("gender", gender);
            JSONArray newArray = new JSONArray();
            boolean doesExist = false;
            for(int i = 0; i < users.size(); i++) {
                JSONObject cur = (JSONObject) users.get(i);
                if(!cur.equals(newObj)) {
                    newArray.add(cur);
                }
                else doesExist = true;
            }
            if(doesExist) System.out.println("Successfully deleted user!");
            JSONObject tmpObj = new JSONObject();
            tmpObj.put("users", newArray);
            Files.write(Paths.get("D:\\languages\\java\\wsp\\users.json"), tmpObj.toString().getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String iterateThroughJson(String login, String password) {
        try {
            JSONArray users = getJsonArray();
            for(int i = 0; i < users.size(); i++) {
                JSONObject obj = (JSONObject) users.get(i);
                if(obj.get("login").equals(login) && obj.get("password").equals(password)) {
                    return (String) obj.get("role");
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
