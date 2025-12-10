package composant;

import strategie.SuivreRoute;

public class Multicoque extends Voilier{

    public Multicoque(String nom, SuivreRoute suivreRoute) {
        super(nom, suivreRoute);
    }


    @Override
    public String toString() {
        return "Multicoque" + super.toString();
    }
}
