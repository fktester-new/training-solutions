package inheritancemethods.bankaccount;

public class CreditAccount extends DebitAccount {

    private long overdraftLimit;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit){

        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public boolean transaction(long amount){
        long grossAmount = amount + costOfTransaction(amount);
        if (getBalance() + overdraftLimit < grossAmount){
            return false;
        } else if (getBalance() > grossAmount){
            super.transaction(amount);
            } else{
            long diff = getBalance() - grossAmount;
            overdraftLimit += diff;
            balanceToZero();
        }
        return true;
    }

    public long getOverdraftLimit() {
        return overdraftLimit;
    }
}
