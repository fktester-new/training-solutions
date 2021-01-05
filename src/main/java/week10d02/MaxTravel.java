package week10d02;

import java.util.List;

public class MaxTravel {

    public int getMaxIndex(List<Integer> passengers){

        if (passengers == null || passengers.size() == 0){
           throw new IllegalArgumentException("The input list is empty or null!");
       }
       int[] numberOfPassengers = new int[30];
       for (int num: passengers){
           numberOfPassengers[num]++;
        }

       int maxValue = 0;
       int maxIndex = 0;
       for (int i = 0; i < numberOfPassengers.length; i++){
           if (numberOfPassengers[i] > maxValue){
               maxValue = numberOfPassengers[i];
               maxIndex = i;
           }
       }
       return maxIndex;
    }




}
