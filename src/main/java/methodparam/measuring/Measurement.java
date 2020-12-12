package methodparam.measuring;

public class Measurement {

    private double[] values;

    public Measurement(double[] values) {
        this.values = values;
    }

    public int findFirstIndexInLimit(int lower, int upper){
        for (int i = 0; i<values.length; i++){
            if (lower < values[i] && values[i] < upper){
                return i;
            }
        }
        return -1;
    }

    public double minimum(){
        double min = values[0];
        for (int i = 1; i < values.length; i++){
            if (values[i] < min){
                min = values[i];
            }
        }
        return min;
    }

    public double maximum(){
        double max = values[0];
        for (int j = 1; j < values.length; j++){
            if (max < values[j]){
                max = values[j];
            }
        }
        return max;
    }

    public ExtremValues minmax(){
        return new ExtremValues(minimum(), maximum());
    }
}
