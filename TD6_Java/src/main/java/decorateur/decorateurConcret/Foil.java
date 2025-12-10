package decorateur.decorateurConcret;

import composant.Voilier;
import decorateur.ArmementSupplementaire;

public class Foil extends ArmementSupplementaire {
    public Foil(Voilier voilier) {
        super(voilier);
    }

    @Override
    public String toString() {
        return super.toString()+"est un foil";
    }
}
