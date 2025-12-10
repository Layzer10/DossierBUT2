package client;

import observateur.Abandon;
import observateur.ClasseVoilier;
import observateur.DirectionCourse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import outilsJSON.LectureFichierJSON;

public class ClientObservateur {
    public static void main(String[] args) {
        //JSONObject jsonRouteDuCafe= LectureFichierJSON.lectureJSON("JSON/Abandons.json");
        //System.out.println(jsonRouteDuCafe.get("nom") + " - " + ((JSONArray) jsonRouteDuCafe.get("abandons")).size() + " abandons");

        //Sujet observé
        DirectionCourse directionCourse = new DirectionCourse();

        //les observateurs
        ClasseVoilier class40 = new ClasseVoilier("Class40");
        ClasseVoilier oceanFifty = new ClasseVoilier("OceanFifty");

        directionCourse.enregistreObservateur(class40);
        directionCourse.enregistreObservateur(oceanFifty);

        simulationCourse("JSON/Abandons.json", directionCourse);

        System.out.println(class40);
        System.out.println(oceanFifty);
    }

    private static void simulationCourse(String fileName, DirectionCourse directionCourse) {
        JSONObject jsonRouteDuCafe = LectureFichierJSON.lectureJSON(fileName);
        JSONArray tabJson = ((JSONArray) jsonRouteDuCafe.get("abandons"));
        for (int i = 0; i < tabJson.size(); i++) {
            JSONObject jsonObject= (JSONObject) tabJson.get(i);
            String nom= jsonObject.get("nom").toString();
            String classe= jsonObject.get("classe").toString();
            String skippers= jsonObject.get("skippers").toString();
            Abandon abandon= new Abandon(nom,classe,skippers);
            directionCourse.setAbandon(abandon);
            //System.out.println(abandon);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
