package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írjon be egy egész számot!");
        int n = scanner.nextInt();

        System.out.println(n % 3 == 0 ? "Osztható 3-mal" : "Nem osztható 3-mal");
    }
}
