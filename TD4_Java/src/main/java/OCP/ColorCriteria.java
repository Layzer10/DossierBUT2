package OCP;

public class ColorCriteria implements Criteria<Product>{
    Color color;
    public ColorCriteria(Color color){
        this.color = color;
    }

    /**
     * Retourne true quand le produit recu en parametre a la meme couleur que le champs couleur this
     * @param product
     * @return
     */
    @Override
    public boolean isSatisfiedBy(Product product) {
        return color==product.color;
    }
}
