package statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a befektetett összeget:");
        int amount = scanner.nextInt();

        System.out.println("Adja meg a kamatlábat:");
        int irate = scanner.nextInt();

        Investment investment = new Investment(amount, irate);

        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam 60 napra: " + investment.getYield(60));

        System.out.println("A kivett összeg 90 nap után: " + investment.close(90));
        System.out.println("A kivett összeg 120 nap után: " + investment.close(120));

    }
}
