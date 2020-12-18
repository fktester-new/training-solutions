package week08d05;

public class MathAlgorithms {

    public int greatestCommonDivisor(int a, int b){
        boolean x = a <= 0 || !(a == (int) a);
        boolean y = b <= 0 || !(b == (int) b);
        if(x || y){
            throw new IllegalArgumentException("I need positive integers!");
        }

        int i = Math.min(a, b) / 2;
        int d = 1;
        for (int j = 2; j <= i; j++){
            if (a % j == 0 && b % j == 0){
                d = j;
            }
        }
        return d;
    }
}
