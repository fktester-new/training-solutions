package week07d03;

import java.util.List;

public class NumberList {

    public static boolean isIncreasing(List<Integer> numbers){
        if (numbers == null || numbers.size() == 0){
            throw new IllegalArgumentException("There must be alt least one number!");
        }
        for (int i = 0; i < numbers.size()-1; i++){
            if (numbers.get(i) > numbers.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isIncreasingOther(List<Integer> numbers) {
        if (numbers == null || numbers.size() == 0) {
            throw new IllegalArgumentException("There must be alt least one number!");
        }
        boolean ok = true;
        int i = 0;
        while (i < numbers.size() - 1) {
            if (numbers.get(i) > numbers.get(i + 1)) {
                ok = false;
                return ok;
            }
            i++;
        }
        return ok;
    }

}
