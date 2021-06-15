package lambdaintermediate;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Coffee {

    private CoffeeType type;
    private BigDecimal price;

    public Coffee(CoffeeType type, BigDecimal price) {
        this.type = type;
        this.price = price;
    }

    public CoffeeType getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public static void main(String[] args) {
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("bonobo");
        List<String> two = Arrays.asList("Baby Gorilla", "Mama Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        // animals.forEach(System.out::println);
        // []
        // [bonobo]
        // [Baby Gorilla]
        animals.flatMap(l -> l.stream()).forEach(System.out::println);
        // bonobo
        // Baby Gorilla
        // Mama Gorilla
    }
}
