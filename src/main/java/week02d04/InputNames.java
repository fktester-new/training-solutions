package week02d04;

import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {
        String[] names = new String[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Írj be egy nevet!");
            names[i] = scanner.nextLine();
        }
        for (int j = 0; j < names.length; j++) {
            System.out.println("Sorszám: " + (j - 1) + " , Név: " + names[j]);
        }
    }
}
