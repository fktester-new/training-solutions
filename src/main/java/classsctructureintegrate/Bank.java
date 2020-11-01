package classsctructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mi a bankszámla száma?");
        String accountNumber = scanner.nextLine();

        System.out.println("Ki a bankszámla tulajdonosa?");
        String owner = scanner.nextLine();

        System.out.println("Mekkora összeggel nyitja?");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount account1 = new BankAccount(accountNumber, owner, balance);

        System.out.println("Mi a másik bankszámla száma?");
        String accountNumber2 = scanner.nextLine();

        System.out.println("Ki a másik bankszámla tulajdonosa?");
        String owner2 = scanner.nextLine();

        System.out.println("Mekkora összeggel nyitja?");
        int balance2 = scanner.nextInt();

        BankAccount account2 = new BankAccount(accountNumber2, owner2, balance2);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

        System.out.println("Mennyit fizet be az első számlára?");
        int depositAmount = scanner.nextInt();
        account1.deposit(depositAmount);
        System.out.println(account1.getInfo());


        System.out.println("Mennyit vesz le a második számláról?");
        int withdrawAmount = scanner.nextInt();
        account2.withdraw(withdrawAmount);
        System.out.println(account2.getInfo());

        System.out.println("Mennyit szeretne átutalni az első számláról a másodikra?");
        int transferAmount = scanner.nextInt();
        account1.transfer(account2, transferAmount);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());
    }
}
