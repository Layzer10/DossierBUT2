package observateur;

public interface Observable {
     void enregistreObservateur(Observateur observateur);
     void desenregistreObservateur(Observateur observateur);
     void informeObservateurs();
}
