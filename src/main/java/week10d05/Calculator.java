package week10d05;

import java.util.Arrays;

public class Calculator {

    public int findMinSum(int[] arr) {
        if (arr == null || arr.length < 4) {
            throw new IllegalArgumentException("I need at least 4 numbers!");
        }
        Arrays.sort(arr);
        int result = 0;

        for (int i = 0; i < 4; i++) {
            result += arr[i];
        }
        return result;
    }

    public int findMinSumWithoutSort(int[] arr){
        if (arr == null || arr.length < 4) {
            throw new IllegalArgumentException("I need at least 4 numbers!");
        }
        int sum = 0;

        for (int j = 0; j < 4; j++){
            int index = findMinElementIndex(arr);
            sum += arr[index];
            arr[index] = Integer.MAX_VALUE;
        }
        return sum;
    }




        private int findMinElementIndex(int[] numbers){
        int min = numbers[0];
        int index = 0;
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
                index = i;
            }
        }
        return index;
        }
    }

