package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount(List<Salesperson> salespersons){
        int sum = 0;
        for (Salesperson s : salespersons) {
            sum += s.getAmount();
        }
        return sum;
    }
}
