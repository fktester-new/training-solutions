package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersons){
        Salesperson furthestBelowTarget = null;

        for (Salesperson s : salespersons) {
            if (furthestBelowTarget == null || (s.getDifferenceFromTarget() < 0 && s.getDifferenceFromTarget() < furthestBelowTarget.getDifferenceFromTarget())){
                furthestBelowTarget = s;
            }
        }
        return furthestBelowTarget;
    }
}
