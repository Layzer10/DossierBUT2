package OCP;

public class PriceCriteria implements Criteria<Product>{
    double prixMin;
    double prixMax;

    public PriceCriteria(double prixMin, double prixMax){
        this.prixMin = prixMin;
        this.prixMax = prixMax;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return product.price >= prixMin && product.price <= prixMax;
    }
}
