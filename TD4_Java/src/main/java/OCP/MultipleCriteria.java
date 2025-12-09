package OCP;

import java.util.List;

public class MultipleCriteria implements Criteria<Product>{
    List<Criteria<Product>> criteriaList;

    public MultipleCriteria(List<Criteria<Product>> criteriaList) {
        this.criteriaList= criteriaList;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        for(Criteria criteria : criteriaList){
            if(!criteria.isSatisfiedBy(product)){
                return false;
            }
        }
        return true;
    }
}
