package arraysexercises.standarddev;

public class Deviation {

    public double standardDeviation(double[] values){
        double avg = calculateAverage(values);
        double sum = sumOfSquares(values, avg);
        return Math.sqrt(sum / (values.length - 1) );
    }

    private double sumOfSquares(double[] values, double avg) {
        double result = 0.0;
        for (double d : values) {
            result += (d - avg) * (d - avg);
        }
        return result;
    }


    private double calculateAverage(double[] values) {
        double sum = 0.0;
        for (double d: values) {
            sum += d;
        }
        return sum / values.length;
    }
}
