package methodstructure.pendrives;

import java.util.ArrayList;
import java.util.List;

public class Pendrives {

    private static final List<Pendrive> pendrives = new ArrayList<>();

    public Pendrive best(List<Pendrive> pendrives){
       Pendrive best = pendrives.get(0);
        for (int i = 1; i < pendrives.size(); i ++){
            if (best.comparePricePerCapacity(pendrives.get(i)) == 1){
                best = pendrives.get(i);
            }
        }
       return best;
    }

    public Pendrive cheapest(List<Pendrive> pendrives){
        Pendrive cheapest = pendrives.get(0);
        for(int i = 1; i < pendrives.size(); i++){
            if (pendrives.get(i).cheaperThan(cheapest)){
                cheapest = pendrives.get(i);
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity){
        for (Pendrive p : pendrives){
          if (p.getCapacity() == capacity){
              p.risePrice(percent);
            }
        }

    }

}
