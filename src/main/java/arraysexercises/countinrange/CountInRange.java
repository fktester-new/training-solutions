package arraysexercises.countinrange;

public class CountInRange {

    public int countInRange(int[] numbers, int min, int max){
        if (numbers == null || numbers.length == 0 || max <= min){
            throw new IllegalArgumentException("There is no valid data to work on.");
        }
        int counter = 0;
        for (int n : numbers) {
            if (n > min && n < max){
                counter++;
            }
        }
        return counter;
    }
}

