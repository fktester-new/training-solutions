package array;

public class ArrayMain {
    public static void main(String[] args) {
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(days[1]);
        System.out.println(days.length);

        int [] powersOfTwo = new int[5];
        powersOfTwo[0] = 1;

        for (int i = 1; i < powersOfTwo.length; i++) {
            powersOfTwo[i] = powersOfTwo[i - 1] * 2;
        }

        System.out.println();

        for (int i = 0; i < powersOfTwo.length; i++) {
            System.out.println(powersOfTwo[i] + " ");
        }


        boolean [] booleans = new boolean[6];

        for (int i = 1; i < booleans.length; i++) {
            booleans[i] = ! booleans[i-1];
        }

        System.out.println();

        for (int i = 0; i < booleans.length; i++) {
            System.out.println(booleans[i] + " ");
        }
    }
}
