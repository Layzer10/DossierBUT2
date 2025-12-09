package decorateur;
import composant.Voilier;
public abstract class ArmementSupplementaire {
    protected Voilier voilier;

    public ArmementSupplementaire(Voilier voilier) {
        super();
        this.voilier = voilier;
    }
    public String ToString() {
        return voilier.toString();
    }
}
