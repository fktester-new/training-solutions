package exceptions.polinom;

public class Polynomial {

    private double[] coefficients;


    public Polynomial(double[] coefficients) {
        if (coefficients == null) {
            throw new NullPointerException("coefficients is null");
        }
        this.coefficients = coefficients;
    }

    public Polynomial(String[] stringCoefficients) {
        if (stringCoefficients == null) {
            throw new NullPointerException("coefficientStrs is null");
        }
        try {
            this.coefficients = convertStringCoefficients(stringCoefficients);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Illegal coefficients, not a number", nfe);
        }
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    public double evaluate(double x){
        int n = coefficients.length - 1;
        double result = 0;

        for (int i = n; i >= 0; i--){
            result += coefficients[i] * Math.pow(x, (double) (n - i));
        }
        return result;
    }

    private double[] convertStringCoefficients(String[] stringCoefficients){
        double[] coefficients = new double[stringCoefficients.length];
        for (int j = 0; j < stringCoefficients.length; j++){
            coefficients[j] = Double.parseDouble(stringCoefficients[j]);
        }
        return coefficients;
    }
}
