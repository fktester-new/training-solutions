package arraysexercises.percenteven;

public class Evens {

    public double percentEven(int[]arr){
        if (arr.length == 0){
            return 0.0;
        }
        int counter = 0;
        double percentage = 0.0;
        for (int n : arr) {
            if(n % 2 == 0){
                counter++;
            }
        }
        if (counter != 0) {
            percentage = (counter * 100.0) / arr.length;
        }
        return percentage;
    }
}
