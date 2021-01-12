package week11d01;

public class DivisorFinder {

    public int findDivisors(int n){
        String[] str = Integer.toString(n).split("");
        int count = 0;
        int x = 1;

        for (int i = 0; i < str.length; i++){
            x = Integer.parseInt(str[i]);
            if (x == 0){
                throw new ArithmeticException("Division by zero!");
            }
            if(n % x == 0){
                count++;
            }
        }
        return count;
    }
}
