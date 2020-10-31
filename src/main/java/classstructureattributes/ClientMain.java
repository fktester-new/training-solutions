package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        client.name = scanner.nextLine();

        System.out.println("What's your year of birth?");
        client.year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What's your address?");
        client.address = scanner.nextLine();

        System.out.println("Your registration data are:");
        System.out.println("Your name: " + client.name);
        System.out.println("Your year of birth: " + client.year);
        System.out.println("Your address: " + client.address);
    }
}
