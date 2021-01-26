package ioreadstrings.transactions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private List<BankAccount> accountList = new ArrayList<>();

    public List<BankAccount> getAccountList() {
        return accountList;
    }

    public void uploadListFromFile(String fileName){
        Path file = Path.of(fileName);
        try {
            List<String> accounts = Files.readAllLines(file);
            for (String s : accounts) {
                String[] account = s.split(";");
                BankAccount bankAccount = new BankAccount(account[0], account[1], Integer.parseInt(account[2]));
                accountList.add(bankAccount);
        }
        }catch (IOException e) {
            throw new IllegalStateException("Can't open file",e);
        }
    }

    public void makeTransactions(String fileName) {
        Path file = Path.of(fileName);
        try {
            List<String> transactions = Files.readAllLines(file);
            for (String s : transactions) {
                String[] transaction = s.split(";");
                String accountNumber = transaction[0];
                double amount = Double.parseDouble(transaction[1]);
                for (BankAccount account : accountList) {
                    if (accountNumber.equals(account.getAccountNumber())) {
                        account.setBalance(amount);
                    }
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't open file", e);
        }
    }
}
