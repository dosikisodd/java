package tools;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import enums.Faculty;
import enums.Gender;
import users.Student;

import org.json.JSONArray;

public class test {
    static String urlString = "https://api.jsonbin.io/v3/b/639cb034dfc68e59d56a0e4c";
    static String masterKey = "$2b$10$vpowIrRYKnDpIN1ZKuft1.oi7QxTZih7f2/H6.U44Kb1zj2laSuai";
    static String accessKey = "$2b$10$uHrp/nRYrcO0CfunaTw8eeHid4Lplz.ohrq3PKmcW9A03briljT3y";
    public static void main(String[] args) {
        addDataToDB();
        printDB();
    }
    public static void printDB() {
        String data = "";
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-MASTER-KEY", masterKey);
            InputStream inputStream = connection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while((line = bufferedReader.readLine()) != null) {
                data += line;
            }
            if(!data.isEmpty()) {
                // JSONObject obj = (JSONObject) new JSONObject(data).get("record");
                // JSONArray users = obj.getJSONArray("users");
                // System.out.println(users);
                JSONObject obj = new JSONObject(data);
                System.out.println(obj);
            }
            connection.disconnect();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void addDataToDB() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(new Student("Student", "Test",
            "testlogin", "testpassword", Gender.OTHER, 1, Faculty.BS, "1234"));
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("PUT");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("X-Access-Key", accessKey);
            connection.setRequestProperty("X-Master-Key", masterKey);
            OutputStream out = connection.getOutputStream();
            out.write(json.getBytes("utf-8"));
            out.flush();
            out.close();
            System.out.println(connection.getResponseMessage());
            connection.disconnect();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
