package arraysexercises.collapse;

import java.util.ArrayList;
import java.util.List;

public class Collapsing {

    public int[] collapse(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("The array is empty!");
        }
        int n = a.length;
        int[] result;
        if (isEven(n)) {
            result = calculateEven(a);
        } else {
            result = calculateOdd(a);
        }
        return result;
    }

    private int[] calculateOdd(int[] a) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < a.length - 2; i += 2) {
            temp.add(a[i] + a[i + 1]);
        }
        temp.add(a[a.length - 1]);
        return fillArray(temp);
    }


    private int[] calculateEven(int[] a) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i += 2) {
            temp.add(a[i] + a[i + 1]);
        }
        return fillArray(temp);
    }

    private int[] fillArray(List<Integer> temp) {
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        return result;
    }

    private boolean isEven(int n) {
        return n % 2 == 0;
    }
}
