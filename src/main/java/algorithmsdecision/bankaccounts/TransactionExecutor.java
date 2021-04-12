package algorithmsdecision.bankaccounts;

import java.util.List;

public class TransactionExecutor {

    public void executeTransactions(List<Transaction> transactions, List<BankAccount> accounts){
        for (Transaction transaction : transactions){
            BankAccount relatedAccount = findRelatedAccount(transaction.getAccountNumber(), accounts);
                if (relatedAccount != null){
                    excecuteTransaction(relatedAccount, transaction);
                }
            else {
                transaction.setNotExecutedSuccesfully();
                }
        }
    }

    private BankAccount findRelatedAccount(String accountNumber, List<BankAccount> accounts){
        BankAccount result = null;
        for (BankAccount account : accounts) {
            if (accountNumber.equals(account.getAccountNumber())){
                result = account;
            }
        }
        return result;
    }

    private void excecuteTransaction(BankAccount relatedAccount, Transaction transaction){
        if (transaction.isCredit()){
            relatedAccount.deposit(transaction.getAmount());
            transaction.setExecutedSuccesfully();
        } else {
            if(relatedAccount.withdraw(transaction.getAmount())){
                transaction.setNotExecutedSuccesfully();
            }
            else {
                transaction.setNotExecutedSuccesfully();
            }
        }
    }
}
