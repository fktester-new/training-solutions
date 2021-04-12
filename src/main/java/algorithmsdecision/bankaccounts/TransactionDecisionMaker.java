package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionDecisionMaker {

    public boolean containsCreditEntryGreaterThan(List<Transaction> transactions, LocalDateTime startTime, LocalDateTime endTime, int limit) {
        boolean contains = false;
        int i = 0;
        while (i < transactions.size() && !contains) {
            if (examineTransaction(transactions.get(i), startTime, endTime, limit)) {
                contains = true;
            }
            i++;
        }
        return contains;
    }

    private boolean examineTransaction(Transaction transaction, LocalDateTime start, LocalDateTime end, int limit) {
        return (transaction.isDebit()
                && transaction.getDateOfTransaction().isAfter(start)
                && transaction.getDateOfTransaction().isBefore(end)
                && transaction.getAmount() > limit);

    }
}
