package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersons) {

        Salesperson personWithMaxAmount = salespersons.get(0);
        for (Salesperson person : salespersons) {
            if (person.getAmount() > personWithMaxAmount.getAmount()) {
                personWithMaxAmount = person;
            }
        }
        return personWithMaxAmount;
    }

}
