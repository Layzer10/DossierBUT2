package client;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import outilsJSON.LectureFichierJSON;

public class Client2
{
    public static void main(String[] args)
    {
        JSONObject jsonRouteDuCafe= LectureFichierJSON.lectureJSON("JSON/Abandons.json");
        System.out.println(jsonRouteDuCafe.get("nom") + " - " + ((JSONArray) jsonRouteDuCafe.get("abandons")).size() + " abandons");
    }
}
