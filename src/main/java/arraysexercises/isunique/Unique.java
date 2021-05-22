package arraysexercises.isunique;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Unique {

    public boolean isUnique(int[] numbers){
        Map<Integer, Integer> result = new HashMap<>();
        for (int n : numbers) {
           if (result.containsKey(n)){
               result.put(n, result.get(n) + 1);
           } else {
               result.put(n,1);
           }
        }
        return checkNumbers(result);
    }

    private boolean checkNumbers(Map<Integer, Integer> result) {
        Set<Integer> keys = result.keySet();
        for (int k:keys) {
            if (result.get(k) > 1){
                return false;
            }
        }
        return true;
    }
}
