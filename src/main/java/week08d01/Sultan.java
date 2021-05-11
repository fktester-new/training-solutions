package week08d01;

import java.util.ArrayList;
import java.util.List;

public class Sultan {

    public List<Integer> openDoors(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Too low number of doors!");
        }
        int[] doors = initArray(n);
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (j % i == 0) {
                    doors[j]++;
                }
            }
        }
        return searchForOpenDoors(doors);
    }

    private List<Integer> searchForOpenDoors(int[] doors) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < doors.length; i++) {
            if (doors[i] % 2 == 1) {
                result.add(i);
            }
        }
        return result;
    }

    private int[] initArray(int n) {
        int[] init = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            init[i] = 0;
        }
        return init;
    }

}
