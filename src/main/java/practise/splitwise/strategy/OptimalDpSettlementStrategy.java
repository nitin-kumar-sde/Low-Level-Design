package practise.splitwise.strategy;
import practise.splitwise.model.SettlementPair;
import practise.splitwise.model.Transaction;
import practise.splitwise.model.User;

import java.util.*;

/**
 * Calculates the minimum number of transactions required to settle all debts
 * using DP + Bitmask.
 */
public class OptimalDpSettlementStrategy implements SettlementStrategy {


    @Override
    public  List<Transaction> settle(Map<SettlementPair, Double> balances) {

        List<Double> creditList = getCreditAmounts(balances);

        int n = creditList.size();
        if (n == 0) return new ArrayList<>();


        int[] dp = new int[1 << n];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int maxSubGroups = dfs((1 << n) - 1, dp, creditList);

        // Final Answer: n - number of perfectly settled subgroups
        int minTransactions = n - maxSubGroups;
        // ideally this should get all th min transactions
        // returning dummy list for now.
        return new ArrayList<>(minTransactions);
    }

    private static List<Double> getCreditAmounts(Map<SettlementPair, Double> balances) {
        Map<User, Double> netBalances = new HashMap<>();
        for (Map.Entry<SettlementPair, Double> entry : balances.entrySet()) {
            SettlementPair pair = entry.getKey();
            double amount = entry.getValue();
            User debtor = pair.getUser1();
            User creditor = pair.getUser2();

            netBalances.put(debtor, netBalances.getOrDefault(debtor, 0.0) - amount);
            netBalances.put(creditor, netBalances.getOrDefault(creditor, 0.0) + amount);
        }


        List<Double> creditList = new ArrayList<>();
        for (double val : netBalances.values()) {
            if (Math.abs(val) > 0.001) {
                creditList.add(val);
            }
        }
        return creditList;
    }

    /**
     * DFS with memoization to determine the maximum number of fully settled subgroups.
     */
    private int dfs(int mask, int[] dp, List<Double> creditList) {
        if (mask == 0) return 0; // no users left
        if (dp[mask] != -1) return dp[mask];

        int maxSubGroups = 0;
        int n = creditList.size();

        // Try all possible subtasks of current mask
        for (int submask = mask; submask > 0; submask = (submask - 1) & mask) {
            // If this subset is balanced (sum == 0), we can treat it as one settled group
            if (Math.abs(sumOfMask(creditList, submask)) < 0.001) {
                maxSubGroups = Math.max(maxSubGroups,
                        1 + dfs(mask ^ submask, dp, creditList));
            }
        }

        dp[mask] = maxSubGroups;
        return maxSubGroups;
    }

    /**
     * Calculates sum of balances in a subset represented by a bitmask.
     */
    private double sumOfMask(List<Double> values, int mask) {
        double sum = 0;
        for (int i = 0; i < values.size(); i++) {
            if ((mask & (1 << i)) != 0) {
                sum += values.get(i);
            }
        }
        return sum;
    }

}
