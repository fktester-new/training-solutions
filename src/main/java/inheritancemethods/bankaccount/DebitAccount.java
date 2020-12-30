package inheritancemethods.bankaccount;

public class DebitAccount {

    private static final double COST = 3.0;
    private static final long MIN_COST = 200;
    private String accountNumber;
    private long balance;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public final long costOfTransaction(long amount){
        if (amount * COST / 100 < MIN_COST){
            return MIN_COST;
        } else {
            return (long) (amount * COST / 100);
        }
    }

    public boolean transaction(long amount){
        long grossAmount = amount + costOfTransaction(amount);
        if (balance < grossAmount){
            return false;
        }
        balance -= grossAmount;
        return true;
    }

    public void balanceToZero(){
        balance = 0;
    }
}
