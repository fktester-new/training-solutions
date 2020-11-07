package stringtype;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Felhasználónév:");
        String username = scanner.nextLine();

        System.out.println("Jelszó:");
        String password1 = scanner.nextLine();

        System.out.println("Jelszó még egyszer:");
        String password2 = scanner.nextLine();

        System.out.println("Email cím:");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        System.out.println(userValidator.isValidUsername(username) ? "Felhasználónév rendben" : "Felhasználónév helytelen");
        System.out.println(userValidator.isValidPassword(password1, password2) ? "Jelszó rendben" : "Jelszó helytelen");
        System.out.println(userValidator.isValidEmail(email) ? "E-mail rendben" : "E-mail helytelen");
    }
}
