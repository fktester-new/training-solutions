package arraysexercises.median;

import java.util.Arrays;

public class MedianFinder {

    public double median(int[] numbers) {
        Arrays.sort(numbers);
        int countOfNumbers = numbers.length;
        if (countOfNumbers % 2 == 1) {
            int i = (numbers.length - 1) / 2;
            return numbers[i];
        } else {
            int i = numbers.length / 2;
            return (double) (numbers[i - 1] + numbers[i]) / 2;
        }
    }
}
