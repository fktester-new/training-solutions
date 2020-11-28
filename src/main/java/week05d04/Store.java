package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {
        this.products = products;
    }

    public boolean addProduct(Product product) {
        if (!isValid(product)){
            return false;
        }
        products.add(product);
        return true;
    }

    public int getNumberOfExpired() {
        int count = 0;
        for (Product p : products) {
            if (p.isExpired()){
                count++;
            }
        }
        return count;
    }

    private boolean isValid(Product product) {
        if (containsByName(product)  || product.isExpired()){
            return false;
        }
        return true;
    }

    private boolean containsByName(Product product){
        for (Product p : products) {
            if (p.getName().equals(product.getName())){
                return true;
            }
        }
        return false;
    }
}
