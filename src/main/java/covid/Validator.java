package covid;

import java.util.Scanner;

public class Validator {

    protected static void validateRegistration() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg nevét!");
        String name = scanner.nextLine();
        System.out.println(name);

    }

    public static String generateReport() {
        String r = "Maybe later!";
        System.out.println(r);
        return r;
    }

}
