package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        String problem = "8 / (8 - 2) + 5 / (8 - 5)";
        double result = 8.0 / (8 - 2) + 5.0 / (8 - 5);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi a következő művelet eredménye? Négy tizedesjegy pontossággal kérem.");
        System.out.println(problem);

        double resultByUser = scanner.nextDouble();

        if (Math.abs(result-resultByUser) < 0.0001) {
            System.out.println("Helyes válasz!");
        } else {
            System.out.println("Hibás válasz!");
        }

    }
}
