package observateur;

public class Abandon {
    private String nomVoilier;
    private String nomClasse;
    private String nomSkipper;

    public String getNomClasse() {
        return nomClasse;
    }

    public Abandon(String nomVoilier, String nomClasse, String nomSkipper) {
        this.nomVoilier = nomVoilier;
        this.nomClasse = nomClasse;
        this.nomSkipper = nomSkipper;
    }

    @Override
    public String toString() {
        return "Abandon{" +
                "nomVoilier='" + nomVoilier + '\'' +
                ", nomClasse='" + nomClasse + '\'' +
                ", nomSkipper='" + nomSkipper + '\'' +
                '}';
    }
}
