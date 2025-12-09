package OCP;

import java.util.List;

public class Demo {
    public static void main(String[] args){
        Product apple= new Product("Apple",Color.GREEN,Size.SMALL,20.1);
        Product tree= new Product("Tree",Color.GREEN,Size.LARGE);
        Product house= new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products= List.of(apple, tree, house);

        ProductFilter filter= new ProductFilter();

      /*  System.out.println("Green products : ");
        filter.filterByColor(products,Color.GREEN).forEach(product -> System.out.println("-" + product.name + " is green"));


        System.out.println("Large products : ");
        filter.filterBySize(products,Size.LARGE).forEach(product -> System.out.println("-" + product.name + " is Large"));

        System.out.println("Large products : ");
        filter.filterByColorAndSize(products,Size.LARGE,Color.RED).forEach(product -> System.out.println("-" + product.name + " is Red and large"));
        */
        ColorCriteria colorCriteria= new ColorCriteria(Color.GREEN);

        filter.filter(products, colorCriteria).forEach(product -> System.out.println("-" + product.name + " is green"));;

        PriceCriteria priceCriteria=new PriceCriteria(15,20.5);

        filter.filter(products,priceCriteria).forEach(product -> System.out.println("-" + product.name + " is in intervalle"));

        SizeCriteria sizeCriteria= new SizeCriteria(Size.SMALL);

        filter.filter(products,sizeCriteria).forEach(product -> System.out.println("-" + product.name + " is small"));

        NameCriteria nameCriteria= new NameCriteria("Apple");


        List<Criteria<Product>> criteriaList=List.of(nameCriteria,colorCriteria,sizeCriteria);
      /*  criteriaList= new ArrayList<>();
        criteriaList.add(1,nameCriteria);
        criteriaList.add(2,colorCriteria);
        criteriaList.add(3,sizeCriteria);
        criteriaList.add(4,priceCriteria);*/

        filter.filter(products,new MultipleCriteria(criteriaList)).forEach(product -> System.out.println("-" + product.name + " is ok"));

    }
}
