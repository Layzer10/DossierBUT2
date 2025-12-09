public class Monocoque extends Voilier{

    public Monocoque(String nom, SuivreRoute suivreRoute) {
        super(nom, suivreRoute);
    }

    @Override
    public String toString() {
        return "Monocoque" + super.toString();
    }
}
