package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class SportGadgetStore {

    private List<Product> products;

    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getNumberOfProducts(){
        return products.stream()
                .mapToInt(Product::getQuantity).sum();
    }

    public double getAveragePrice(){
        OptionalDouble average = products.stream().mapToDouble(Product::getPrice).average();
        if (average.isPresent()){
            return average.getAsDouble();
        } else {
            return 0.0;
        }
    }

    public String getExpensiveProductStatistics(double minPrice){
        IntSummaryStatistics statistics = products.stream().filter(x -> x.getPrice() > minPrice).mapToInt(Product::getQuantity).summaryStatistics();
        if (statistics.getCount() > 0){
            StringBuilder result = new StringBuilder("Összesen ")
                    .append(statistics.getCount())
                    .append(" féle termék, amelyekből minimum ")
                    .append(statistics.getMin())
                    .append(" db, maximum ")
                    .append(statistics.getMax())
                    .append(" db, összesen ")
                    .append(statistics.getSum())
                    .append(" db van.");
            return result.toString();
        }
        return "Nincs ilyen termék.";
    }
}
