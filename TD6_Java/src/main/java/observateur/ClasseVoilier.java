package observateur;

import java.util.List;

public class ClasseVoilier implements Observateur{


    String nomClasse;
    List<Abandon> abandons;

    public ClasseVoilier(List<Abandon> abandons) {
        this.abandons = abandons;
    }


    @Override
    public void actualise(Observable observable) {
        DirectionRoute directionRoute = (DirectionRoute) observable;
        Abandon abandon=directionRoute.getDernierAbandon();
        if(abandon.getNomClasse().equals(nomClasse)){
            abandons.add(abandon);
        }
    }
}
