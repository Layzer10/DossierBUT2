package composant;

import strategie.SuivreRoute;

abstract public class Voilier {
    String nom;
    SuivreRoute suivreRoute;

    public Voilier(String nom, SuivreRoute suivreRoute) {
        this.nom = nom;
        this.suivreRoute = suivreRoute;
    }
    public Voilier() {
    }
    public Voilier(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Voilier{" +
                "nom='" + nom + '}';
    }

    public void setSuivreRoute(SuivreRoute suivreRoute) {
        this.suivreRoute = suivreRoute;
    }

    public void appliqueSuivreRoute(){
        suivreRoute.suiveroute();
    }

    public String getNom() {
        return nom;
    }
}
