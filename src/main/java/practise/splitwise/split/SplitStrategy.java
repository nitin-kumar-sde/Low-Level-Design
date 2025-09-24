package practise.splitwise.split;

import practise.splitwise.model.User;

import java.util.List;
import java.util.Map;

public interface SplitStrategy {
    /**
     * Calculates the split for the given amount among participants based on specific split details.
     *
     * @param amount        The total amount to split.
     * @param participants  The list of users participating in the split.
     * @param splitDetails  Additional details required for the specific split type.
     *                      For example:
     *                      - Equal split: empty or null
     *                      - Exact split: {"amounts": Map<User, Double>}
     *                      - Percentage split: {"percentages": List<Double>}
     * @return A map where the key is the User and the value is the amount they owe.
     */
    Map<User, Double> calculateSplit(double amount,
                                     List<User> participants,
                                     Map<String, Object> splitDetails);
}
