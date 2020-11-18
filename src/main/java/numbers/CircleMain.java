package numbers;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg az első kör átmérőjét (egész)!");
        int dFirst = scanner.nextInt();
        Circle circle1 = new Circle(dFirst);
        scanner.nextLine();

        System.out.println("Add meg a második kör átmérőjét (egész)!");
        int dSecond = scanner.nextInt();
        Circle circle2 = new Circle(dSecond);

        System.out.println("Az első kör kerülete: " + circle1.perimeter(dFirst));
        System.out.println("Az első kör területe: " + circle1.area(dFirst));
        System.out.println("A második kör kerülete: " + circle2.perimeter(dSecond));
        System.out.println("A második kör területe: " + circle2.area(dSecond));
    }
}
