package OCP;

public class SizeCriteria implements Criteria<Product>{
    Size size;
    public  SizeCriteria(Size size){
        this.size = size;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return product.size==size;
    }
}
