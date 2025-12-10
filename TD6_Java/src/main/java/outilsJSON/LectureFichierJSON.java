package outilsJSON;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class LectureFichierJSON {
    public static JSONObject lectureJSON (String fileName) {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(fileName)) {
            return (JSONObject) jsonParser.parse(reader);

        }
        catch (IOException | ParseException e){
            e.printStackTrace();
    }
        return null;
}}
