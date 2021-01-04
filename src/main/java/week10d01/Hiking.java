package week10d01;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double> heights){

        if (isEmpty(heights)){
            throw new IllegalArgumentException("The list of heights must not be empty or null!");
        }
        double result = 0.0;
        for (int i = 1; i < heights.size(); i++){
            double diff = heights.get(i) -heights.get(i - 1);
            if (diff > 0){
                result += diff;
            }
        }
        return (result * 100) / 100.0 ;
    }

    private boolean isEmpty(List list){
        return list == null || list.size() == 0;
    }
}
