package observateur;

import java.util.List;

public class DirectionRoute implements Observable{

    public Abandon getDernierAbandon() {
        return abandon;
    }

    Abandon abandon;
    List<Observateur>observateurs;
    @Override
    public void enregistreObservateur(Observateur observateur) {

    }

    @Override
    public void desenregistreObservateur(Observateur observateur) {

    }

    @Override
    public void informeObservateur(Observateur observateur) {

    }
}
