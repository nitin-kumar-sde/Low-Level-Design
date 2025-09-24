package practise.splitwise.model;

import practise.splitwise.split.SplitStrategy;

import java.util.*;

public class Expense {

    private final Integer id;
    private final String description;
    private final double amount;
    private final User payer;
    private final List<User> participants;
    private final Map<User, Double> shares;
    private final Group group;

    public Expense(final Integer id, final String description, final double amount,
                   final User payer, final List<User> participants,
                   final SplitStrategy strategy, final Group group) {

        // add basic validations
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }

        this.id = id;
        this.description = description;
        this.amount = amount;
        this.payer = payer;
        this.participants = List.copyOf(participants);
        this.shares = strategy.calculateSplit(amount, participants, new
                HashMap<>());
        this.group = group;
    }

    // Getters
    public Integer getId() { return id; }
    public String getDescription() { return description; }
    public double getAmount() { return amount; }
    public User getPayer() { return payer; }
    public List<User> getParticipants() { return participants; }
    public Map<User, Double> getShares() { return shares; }

}
