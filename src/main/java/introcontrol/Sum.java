package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg öt egész számot!");

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Adja meg a " + (i + 1) + ". egész számot!");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("A számok összege: " + sum);
    }
}
