package troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public void addTrooper(Trooper trooper){
        if (trooper == null){
            throw new IllegalArgumentException("Trooper must not be null!");
        }
        troopers.add(trooper);
    }

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void moveTrooperByName(String name, Position target) {
        Trooper trooper = findTrooperByName(name);
        if (trooper != null) {
            moveTrooper(trooper, target);
        }
    }

    public void moveClosestTrooper(Position target){
        if (target == null){
            throw new IllegalArgumentException("Target must not be null!");
        }
        Trooper closest = findClosestTrooper(target);
        if (closest != null){
            moveTrooper(closest, target);
        }
    }

    private Trooper findTrooperByName(String name){

        for (Trooper t: troopers) {
            if (name.equals(t.getName())){
                return t;
            }
        }
        return null;
    }

    private Trooper findClosestTrooper(Position target){
        if (troopers.isEmpty() ){
            return null;
        }
        Trooper closest = troopers.get(0);
        for (Trooper t: troopers) {
            if (t.distanceFrom(target) < closest.distanceFrom(target)){
                closest = t;
            }
        }
        return closest;
    }

    private void moveTrooper(Trooper trooper, Position target){
        trooper.changePosition(target);
    }


}
