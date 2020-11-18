package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {

        int maxRounds = 6;
        int round = 0;
        int number = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println(number);
        boolean ok = false;

        while (!ok && round < maxRounds) {

            round++;
            System.out.println("Kérek egy számot: ");
            int guessed = Integer.parseInt(sc.nextLine());
            if (guessed > number) {
                System.out.println("A gondolt szám kisebb!");
            } else if (guessed < number) {
                System.out.println("A gondolt szám nagyobb!");
            } else {
                System.out.println("Eltaláltad a számot!");
                ok = true;
            }
        }
}

}
