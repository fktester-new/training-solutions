package classsctructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
       System.out.println("Kérem a termék nevét!");
       Scanner scanner = new Scanner(System.in);
       String name = scanner.nextLine();

       System.out.println("Kérem a termék árát!");
       int price = scanner.nextInt();

       Product product = new Product(name, price);

       System.out.println("A termék neve: " + product.getName());
       System.out.println("A termék ára: " + product.getPrice() + " Ft");

       product.increasePrice(25000);
       System.out.println("A " + product.getName() + " új ára: " + product.getPrice() + " Ft");

       product.decreasePrice(15000);
       System.out.println("A " + product.getName() + " akciós ára: " + product.getPrice() + " Ft");

    }
}
