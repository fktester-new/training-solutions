package lambdacomparator.cloud;

import java.awt.image.Kernel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clouds {

    public CloudStorage alphabeticallyFirst(List<CloudStorage> storages){
        return Collections.min(storages, Comparator.comparing(CloudStorage::getProvider, String::compareToIgnoreCase));
    }

    public List<CloudStorage> worstOffers(List<CloudStorage> storages){
        List<CloudStorage> temp = new ArrayList<>(storages);
        temp.sort(Comparator.reverseOrder());
        return temp.subList(0, Math.min(temp.size(), 3));
    }

    public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> storages){
        return Collections.min(storages, Comparator.comparing(CloudStorage::getPeriod, Comparator.nullsFirst(Comparator.comparingInt(PayPeriod::getLength))).thenComparingDouble(CloudStorage::getPrice));
    }
}
