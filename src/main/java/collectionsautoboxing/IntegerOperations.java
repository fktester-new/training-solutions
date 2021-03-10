package collectionsautoboxing;

import java.util.ArrayList;
import java.util.List;

public class IntegerOperations {

    public List<Integer> createList(int... numbers){
        List<Integer> result = new ArrayList<>();
        for (int n : numbers) {
            result.add(n);
        }
        return result;
    }

    public int sumIntegerList(List<Integer> integerList){
        int sum = 0;
        for (int n : integerList){
            sum += n;
        }
        return sum;
    }

    public int sumIntegerObjects(Integer... integers){
        Integer sum = 0;
        for (Integer i : integers) {
            sum += i;
        }
        return (int) sum;
    }
}
