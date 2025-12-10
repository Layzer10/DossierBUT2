package observateur;

import java.util.ArrayList;
import java.util.List;

public class DirectionCourse implements Observable{

    Abandon abandon;
    List<Observateur>observateurs;

    public DirectionCourse() {
        this.observateurs = new ArrayList<>();
    }

    public Abandon getDernierAbandon() {
        return abandon;
    }

    @Override
    public void enregistreObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void desenregistreObservateur(Observateur observateur) {
        observateurs.remove(observateur);
    }

    @Override
    public void informeObservateurs() {
        for (Observateur observateur : observateurs){
            observateur.actualise(this);
        }
    }
    public void setAbandon(Abandon abandon){
        this.abandon=abandon;
        this.informeObservateurs();
    }
}
