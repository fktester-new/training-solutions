package algorithmsdecision.integers;

import java.util.List;

public class IntegerDecisionMaker {

    public boolean containsGreaterThan(List<Integer> numbers, int limit){
        boolean contains = false;
        int i = 0;
        while(i < numbers.size() && !contains){
            if (numbers.get(i) > limit){
                contains = true;
            }
            i++;
        }
        return contains;
    }

    public boolean containsLowerThan(List<Integer> numbers, int limit){
        boolean contains = false;
        int i = 0;
        while(i < numbers.size() && !contains){
            if (numbers.get(i) < limit){
                contains = true;
            }
            i++;
        }
        return contains;
    }


}
