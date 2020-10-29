package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Second number?");
        int b = scanner.nextInt();
        int sum = a + b;

        System.out.println(a + " + " + b);
        System.out.println(sum);

    }
}
