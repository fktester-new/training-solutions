package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons){
        Salesperson furthestAboveTarget = null;
        for (Salesperson s : salespersons) {
            if (furthestAboveTarget == null || (s.getDifferenceFromTarget() > 0 && s.getDifferenceFromTarget() > furthestAboveTarget.getDifferenceFromTarget())){
               furthestAboveTarget = s;
            }
        }
        return furthestAboveTarget;
    }
}
