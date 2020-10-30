package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        System.out.println("Registration");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("What's your e-mail address?");
        String email = scanner.nextLine();

        System.out.println("Successful registration!");
        System.out.println("Your name: " + name);
        System.out.println("Your e-mail address: " + email);
    }
}
