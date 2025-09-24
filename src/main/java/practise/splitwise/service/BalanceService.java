package practise.splitwise.service;


import practise.splitwise.model.Expense;
import practise.splitwise.model.SettlementPair;
import practise.splitwise.model.Transaction;
import practise.splitwise.model.User;
import practise.splitwise.observer.ExpenseObserver;
import practise.splitwise.strategy.SettlementStrategy;
import practise.splitwise.strategy.SimpleAssignmentSettlementStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BalanceService implements ExpenseObserver {

    private final Map<SettlementPair, Double> balances = new HashMap<>();

    // maintains group level operation
    // all the group level operations could be added.
    // better to create a new Group Balance service.

    private Map<String, Map<SettlementPair, Double>> groupBalances = new HashMap<>();
    // need to inject dynamically.
    private final SettlementStrategy settlementStrategy = new
            SimpleAssignmentSettlementStrategy();

    @Override
    public void onExpenseAdded(Expense expense) {
        updateBalances(expense);
    }

    @Override
    public void onExpenseUpdated(Expense expense) {
        // For simplicity, just reapply update (could extend to reverse old state)
        updateBalances(expense);
    }

    private void updateBalances(final Expense expense) {

        User payer = expense.getPayer();
        Map<User, Double> shares = expense.getShares();

        for (Map.Entry<User, Double> entry : shares.entrySet()) {
            User participant = entry.getKey();
            double amount = entry.getValue();
            if (!participant.equals(payer)) {
                SettlementPair pair = new SettlementPair(participant, payer);
                double current = balances.getOrDefault(pair, 0.0);
                // Positive value: first user owes second user
                double adjusted = participant.equals(pair.getUser1()) ? current + amount : current - amount;
                balances.put(pair, adjusted);
            }
        }
    }

    public double getBalance(User user1, User user2) {
        SettlementPair pair = new SettlementPair(user1, user2);

        double amount = balances.getOrDefault(pair, 0.0);

        return user1.equals(pair.getUser1()) ? amount : -amount;
    }

    public double getTotalBalance(User user) {

        double total = 0.0;
        for (Map.Entry<SettlementPair, Double> entry : balances.entrySet()) {
            SettlementPair pair = entry.getKey();
            double amount = entry.getValue();
            if (pair.getUser1().equals(user)) total -= amount;
            else if (pair.getUser2().equals(user)) total += amount;
        }
        return total;
    }

    // return optimal transactions based on configurable strategy.

    public List<Transaction> getOptimalTransactions() {

        return settlementStrategy.settle(this.balances);
    }

}
