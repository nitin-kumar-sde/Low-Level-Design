package practise.splitwise.strategy;

import practise.splitwise.model.SettlementPair;
import practise.splitwise.model.Transaction;
import practise.splitwise.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackTrackingSettlementStrategy implements SettlementStrategy{

    @Override
    public List<Transaction> settle(Map<SettlementPair, Double> balances) {
        // Step 1: Calculate net balance per user
        Map<User, Double> netBalances = calculateNetBalances(balances);

        List<User> users = new ArrayList<>();
        List<Double> amounts = new ArrayList<>();
        for (Map.Entry<User, Double> entry : netBalances.entrySet()) {
            if (Math.abs(entry.getValue()) > 0.001) {
                users.add(entry.getKey());
                amounts.add(entry.getValue());
            }
        }


        List<Transaction> result = new ArrayList<>();
        backTracking(0, amounts, users, new ArrayList<>(), result);

        return result;
    }

    /**
     * Backtracking solution to explore all possible settlements and minimize transactions.
     *
     * @param start      Current index in amounts list
     * @param amounts    List of user balances (positive = credit, negative = debit)
     * @param users      List of corresponding users
     * @param path       Current list of transactions being explored
     * @param bestResult Best (minimum) transaction list found so far
     */
    private void backTracking(int start, List<Double> amounts, List<User> users,
                              List<Transaction> path, List<Transaction> bestResult) {

        // Skip settled users (balance = 0)
        while (start < amounts.size() && Math.abs(amounts.get(start)) < 0.001) {
            start++;
        }

        // Base case: all users settled
        if (start == amounts.size()) {
            if (bestResult.isEmpty() || path.size() < bestResult.size()) {
                bestResult.clear();
                bestResult.addAll(path);
            }
            return;
        }

        double currentBalance = amounts.get(start);

        // Try to settle current user with all future users
        for (int i = start + 1; i < amounts.size(); i++) {
            if (currentBalance * amounts.get(i) < 0) { // Opposite signs only
                // Calculate transaction amount
                double transfer = Math.min(Math.abs(currentBalance), Math.abs(amounts.get(i)));

                // Create transaction
                User from = currentBalance < 0 ? users.get(start) : users.get(i);
                User to = currentBalance < 0 ? users.get(i) : users.get(start);
                Transaction txn = new Transaction(from, to, transfer);

                // Apply transaction
                amounts.set(i, amounts.get(i) + currentBalance);
                path.add(txn);

                // Recurse
                backTracking(start + 1, amounts, users, path, bestResult);

                // Backtrack
                path.remove(path.size() - 1);
                amounts.set(i, amounts.get(i) - currentBalance);
            }
        }
    }

    /**
     * Convert pairwise balances into net balances for each user.
     */
    private Map<User, Double> calculateNetBalances(Map<SettlementPair, Double> balances) {
        Map<User, Double> net = new HashMap<>();
        for (Map.Entry<SettlementPair, Double> entry : balances.entrySet()) {
            User debtor = entry.getKey().getUser1();
            User creditor = entry.getKey().getUser2();
            double amount = entry.getValue();

            net.put(debtor, net.getOrDefault(debtor, 0.0) - amount);
            net.put(creditor, net.getOrDefault(creditor, 0.0) + amount);
        }
        return net;
    }
}
