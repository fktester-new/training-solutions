package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean containsBalanceGreaterThan(List<BankAccount> bankAccounts, int min){
        boolean contains = false;
        int i = 0;
        while(i < bankAccounts.size() && !contains) {
            if (bankAccounts.get(i).getBalance() > min){
                contains = true;
            }
            i++;
        }
        return contains;
    }
}
