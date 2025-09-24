package practise.splitwise.split;

import practise.splitwise.model.User;

import java.util.*;

public class EqualSplitStrategy implements SplitStrategy {

    @Override
    public Map<User, Double> calculateSplit(double amount,
                                            List<User> participants,
                                            Map<String, Object> splitDetails) {

        int n = participants.size();
        double rawSplit = amount / n;
        double roundedSplit = Math.floor(rawSplit * 100.0) / 100.0; // round down to 2 decimals
        double totalAssigned = roundedSplit * n;
        double remainder = Math.round((amount - totalAssigned) * 100.0) / 100.0;

        Map<User, Double> splits = new HashMap<>();
        for (int i = 0; i < n; i++) {
            double share = roundedSplit;
            // Give remainder to the last participant (or could give to payer later)
            if (i == n - 1) {
                share += remainder;
            }
            splits.put(participants.get(i), share);
        }

        return Collections.unmodifiableMap(splits);
    }
}

