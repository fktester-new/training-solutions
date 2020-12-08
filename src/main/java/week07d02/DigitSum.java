package week07d02;

public class DigitSum {

    public static int sumOfDigits(int x){
        if (x <= 0 ){
            throw new IllegalArgumentException("I need a positive integer!");
        }
        String s = Integer.toString(x);
        int sum = 0;
        for (int i = 0; i < s.length(); i++){

            sum += Character.getNumericValue(s.charAt(i));
        }
        return sum;
    }

    public static int sumOfDigitsOther(int x){
        if (x <= 0 ){
            throw new IllegalArgumentException("I need a positive integer!");
        }
        int sum = 0;
        while(x != 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }
}
