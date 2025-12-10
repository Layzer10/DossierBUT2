package observateur;

import java.util.ArrayList;
import java.util.List;

public class ClasseVoilier implements Observateur{


    String nomClasse;
    List<Abandon> abandons;

    public ClasseVoilier(String nomClasse) {
        this.nomClasse= nomClasse;
        abandons= new ArrayList<Abandon>();
    }


    @Override
    public void actualise(Observable observable) {

        DirectionCourse directionRoute = (DirectionCourse) observable;
        Abandon abandon=directionRoute.getDernierAbandon();
        System.out.println(abandon.getNomClasse() + " "+ nomClasse);
        if(abandon.getNomClasse().equals(nomClasse)){
            System.out.println("nouvel abandon dans " + nomClasse);
            abandons.add(abandon);
        }
    }

    @Override
    public String toString() {
        String result= "ClasseVoilier: nomClasse=" + nomClasse + " sont:";
        for (Abandon abandon: abandons) {
            result+= abandon.getNomVoilier();
        }
        return result;
    }
}
