package practise.splitwise.strategy;

import practise.splitwise.model.SettlementPair;
import practise.splitwise.model.Transaction;
import practise.splitwise.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Simple Iteration based Assignment Strategy.
 */
public class SimpleAssignmentSettlementStrategy implements SettlementStrategy {

    @Override
    public List<Transaction> settle(Map<SettlementPair, Double> balances) {

        Map<User, Double> netBalances = new HashMap<>();

        for (Map.Entry<SettlementPair, Double> entry : balances.entrySet()) {
            SettlementPair pair = entry.getKey();
            double amount = entry.getValue();
            netBalances.put(pair.getUser1(), netBalances.getOrDefault(pair.getUser1(), 0.0) - amount);
            netBalances.put(pair.getUser2(), netBalances.getOrDefault(pair.getUser2(), 0.0) + amount);
        }

        List<User> debtors = new ArrayList<>();
        List<User> creditors = new ArrayList<>();
        for (Map.Entry<User, Double> entry : netBalances.entrySet()) {
            double balance = entry.getValue();
            if (balance < 0) debtors.add(entry.getKey());
            else if (balance > 0) creditors.add(entry.getKey());
        }
        List<Transaction> transactions = new ArrayList<>();
        int i = 0, j = 0;
        while (i < debtors.size() && j < creditors.size()) {
            User debtor = debtors.get(i);
            User creditor = creditors.get(j);
            double debit = -netBalances.get(debtor);
            double credit = netBalances.get(creditor);

            double transfer = Math.min(debit, credit);
            transactions.add(new Transaction(debtor, creditor, transfer));

            netBalances.put(debtor, - (debit - transfer));
            netBalances.put(creditor, credit - transfer);

            if (Math.abs(netBalances.get(debtor)) < 0) i++;
            if (Math.abs(netBalances.get(creditor)) < 0) j++;
        }

        return transactions;
    }
}
