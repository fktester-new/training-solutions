package week07d01;

public class MathAlgorithms {

    public static boolean isPrime(int x){
        if (x< 1) {
            throw new IllegalArgumentException("I need a positive integer!");
        }
        if (x == 1){
            return false;
        }
        if (x == 2){
            return true;
        }
        int n = (int) Math.sqrt(x);
        for (int i = 2; i <= n; i++){
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeOtherWay(int x){
        if (x < 1) {
            throw new IllegalArgumentException("I need a positive integer!");
        }

        int divisors = 0;
        for (int j = 1; j <= x; j++){
            if (x % j == 0){
                divisors++;
            }
        }
        if (divisors == 2) {
            return true;
        }
        return false;
    }
}
