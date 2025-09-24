package practise.splitwise.split;

import practise.splitwise.model.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PercentageSplitStrategy implements SplitStrategy {

    @Override
    public Map<User, Double> calculateSplit(double amount,
                                            List<User> participants,
                                            Map<String, Object> splitDetails) {
        if (participants == null || participants.isEmpty()) {
            throw new IllegalArgumentException("Participants cannot be null or empty");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        if (splitDetails == null || !splitDetails.containsKey("percentages")) {
            throw new IllegalArgumentException("Split details must include 'percentages'");
        }

        @SuppressWarnings("unchecked")
        Map<User, Double> percentages = (Map<User, Double>) splitDetails.get("percentages");

        Map<User, Double> splits = new HashMap<>();

        for (User user : participants) {
            double percentage = percentages.getOrDefault(user, 0.0);
            double share = amount * percentage / 100.0;
            splits.put(user, share);
        }

        return Collections.unmodifiableMap(splits);
    }
}