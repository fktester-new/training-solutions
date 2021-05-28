package arraysexercises.evenbeforeodd;

public class EvensFirst {
    public int[] evenBeforeOdd(int[] numbers) {
        int[] result = new int[numbers.length];
        int indexEven = 0;
        int indexOdd = 0;
        for (int i = 0; i< numbers.length; i++){
            if (numbers[i] % 2 == 0){
                result[indexEven] = numbers[i];
                indexEven++;
            } else {
                result[numbers.length - 1 - indexOdd] = numbers[i];
                indexOdd++;
            }
        }
        return result;
    }
}
