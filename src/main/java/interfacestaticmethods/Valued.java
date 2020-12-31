package interfacestaticmethods;

import java.util.List;

public interface Valued {

    double getValue();

    static double totalValue(List<Valued> items){
        double result = 0.0;
        for (Valued item: items) {
            result +=  item.getValue();
        }
        return result;
    }
}
