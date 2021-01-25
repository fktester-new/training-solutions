package week12d02;

import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Site> sites = new ArrayList<>();

    public void sellSite(Site site){
        sites.add(site);
    }

    private int countSide(int side){
        int count = 0;
        for (int i = 0; i< sites.size(); i++){
            if (sites.get(i).getSide() == side){
                count++;
            }
        }
        return count;
    }

    public int getHouseNumber(){
        if (sites == null || sites.isEmpty()){
            throw new IllegalArgumentException("The list is empty or null");
        }
        Site house = sites.get(sites.size() - 1);
        int amount = countSide(house.getSide());

        return amount * 2 - house.getSide();
    }

    public List<Report> fenceStats(){
        int[] amounts = new int[Fence.values().length];
        for (Site site : sites) {
            amounts[site.getFence().ordinal()] ++;
        }
        List<Report> result = new ArrayList<>();
        for (int i = 0; i < Fence.values().length; i++) {
            result.add(new Report(Fence.values()[i], amounts[i]));
        }
        return result;
    }

    public List<Site> getSites() {
        return sites;
    }
}

