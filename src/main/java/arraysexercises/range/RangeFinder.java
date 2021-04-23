package arraysexercises.range;

import java.util.Arrays;

public class RangeFinder {

    public static int range(int[] numbers){
        if (numbers == null || numbers.length == 0){
            throw new IllegalArgumentException("The array is empty or null.");
        }
        if (numbers.length == 1){
            return 1;
        }
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] - numbers[0] + 1;
    }

    public static int rangeWithLoop(int[] numbers){
        if (numbers == null || numbers.length == 0){
            throw new IllegalArgumentException("The array is empty or null.");
        }
        if (numbers.length == 1){
            return 1;
        }
        int max = findMax(numbers);
        int min = findMin(numbers);
        return max - min + 1;
    }

    private static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int n : numbers) {
           if(n < min){
               min = n;
           }
        }
        return min;
    }

    private static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int n : numbers) {
            if (n > max){
                max = n;
            }
        }
        return max;
    }
}
