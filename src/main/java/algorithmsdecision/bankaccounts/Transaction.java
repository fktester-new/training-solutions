package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;

public class Transaction {

    private String accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;
    private LocalDateTime dateOfTransaction;
    private TransactionStatus status;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount, LocalDateTime dateOfTransaction) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
        this.dateOfTransaction = dateOfTransaction;
        status = TransactionStatus.CREATED;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getDateOfTransaction() {
        return dateOfTransaction;
    }

    public boolean isCredit(){
        return transactionOperation == TransactionOperation.CREDIT;
    }

    public boolean isDebit(){
        return transactionOperation == TransactionOperation.DEBIT;
    }

    public void setExecutedSuccesfully(){
        status = TransactionStatus.SUCCEEDED;
    }

    public void setNotExecutedSuccesfully(){
        status = TransactionStatus.PENDING;
    }
}
