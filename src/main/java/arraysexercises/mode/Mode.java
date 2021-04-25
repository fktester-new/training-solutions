package arraysexercises.mode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Mode {

    public int mode(int[] numbers){
        Arrays.sort(numbers);
        if (numbers[0] >= 0 && numbers[numbers.length - 1] <= 100){
            Map<Integer, Integer> values = loadMap(numbers);
            int counter = 0;
            int key = -1;
            for (Map.Entry<Integer, Integer> entries : values.entrySet()) {
               if (entries.getValue() > counter){
                   counter = entries.getValue();
                   key = entries.getKey();
               }
            }
            return key;
        } else {
            throw new IllegalArgumentException("Invalid number");
        }
    }

    private Map<Integer, Integer> loadMap(int[] numbers) {
        Map<Integer, Integer> result = new HashMap<>();
        for(int i: numbers){
            if (!result.containsKey(i)){
                result.put(i, 1);
            } else {
                result.put(i, result.get(i) + 1);
            }
        }
        return result;
    }
}
