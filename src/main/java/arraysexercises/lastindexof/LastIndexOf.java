package arraysexercises.lastindexof;

public class LastIndexOf {
    public int lastIndexOf(int[] numbers, int num){
        if (numbers == null || numbers.length == 0){
            throw new IllegalArgumentException("There is no number in the array.");
        }
        int index = -1;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == num){
                index = i;
            }
        }
        return index;
    }
}
