package OCP;

public class NameCriteria implements Criteria <Product>{
    String name;
    public NameCriteria(String name){
        this.name = name;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return product.name==name;
    }
}
