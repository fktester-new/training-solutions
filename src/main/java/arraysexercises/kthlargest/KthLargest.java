package arraysexercises.kthlargest;

import java.util.Arrays;

public class KthLargest {

    public int kthLargest(int[] numbers, int k){

        Arrays.sort(numbers);
        return numbers[numbers.length - k - 1];
    }
}
