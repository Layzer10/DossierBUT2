package decorateur.decorateurConcret;

import composant.Voilier;
import decorateur.ArmementSupplementaire;

public class Velo extends ArmementSupplementaire {
    public Velo(Voilier voilier) {
        super(voilier);
    }

    @Override
    public String toString() {
        return super.toString()+"est un velo";
    }
}
