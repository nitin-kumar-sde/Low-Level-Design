package practise.splitwise.strategy;

import practise.splitwise.model.SettlementPair;
import practise.splitwise.model.Transaction;

import java.util.List;
import java.util.Map;

public interface SettlementStrategy {
    /**
     * Computes a list of transactions needed to settle the given balances.
     *
     * @param balances Map of SettlementPair to amount owed (positive means user1 owes user2)
     * @return List of transactions to settle all debts
     */
    List<Transaction> settle(Map<SettlementPair,
            Double> balances);
}

