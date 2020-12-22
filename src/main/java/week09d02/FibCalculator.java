package week09d02;

public class FibCalculator {

    public long sumEvens(int bound){
        long sum = 0;
        int a = 0;
        int b = 1;
        while(b <= bound){
            int f = a + b;
            if(f % 2 == 0){
                sum +=f;
            }
            a = b;
            b = f;
        }
        return sum;
    }

    public static void main(String[] args) {
        FibCalculator fibCalculator = new FibCalculator();
        long sum = fibCalculator.sumEvens(200);
        System.out.println(sum);

    }
}
