package practise.splitwise.factory;

import practise.splitwise.split.EqualSplitStrategy;
import practise.splitwise.split.PercentageSplitStrategy;
import practise.splitwise.split.SplitStrategy;

public class SplitFactory {

    public enum SplitType {
        EQUAL,
        PERCENTAGE,
    }

    /**
     * Factory method to create a SplitStrategy instance based on the specified split type.
     *
     * @param splitType The type of split to create (EQUAL, PERCENTAGE, EXACT).
     * @return An instance of the corresponding SplitStrategy implementation.
     */
    public static SplitStrategy createSplit(SplitType splitType) {

        return switch (splitType) {

            case EQUAL -> new EqualSplitStrategy();

            case PERCENTAGE -> new PercentageSplitStrategy();

        };
    }
}

