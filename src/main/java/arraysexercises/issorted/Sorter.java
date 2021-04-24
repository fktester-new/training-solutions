package arraysexercises.issorted;

public class Sorter {

    public static boolean isSorted(double[] numbers){
        if (numbers.length == 1){
            return true;
        }
        for (int i = 0; i < numbers.length - 1; i++){
            if (numbers[i] > numbers[i + 1]){
                return false;
            }
        }
        return true;
    }
}
