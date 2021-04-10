package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int min){
        int count = 0;
        for (BankAccount account : bankAccounts) {
            if (account.getBalance() > min){
                count++;
            }
        }
        return count;
    }
}
