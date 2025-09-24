package practise.splitwise.controller;

import practise.splitwise.model.Expense;
import practise.splitwise.model.Group;
import practise.splitwise.observer.ExpenseNotifier;
import practise.splitwise.observer.ExpenseObserver;
import practise.splitwise.service.BalanceService;

import java.util.*;

public class GroupController implements ExpenseNotifier {

    private final Map<String, Group> groups;
    private final List<ExpenseObserver> observers;
    private final BalanceService balanceService;

    public GroupController(BalanceService balanceService) {
        groups = new HashMap<>();
        this.observers = new ArrayList<>();
        this.balanceService = balanceService;
    }

    // Create a new group
    public void createGroup(Group group) {
        if (groups.containsKey(group.getId())) {
            throw new IllegalArgumentException("Group already exists with ID: " + group.getId());
        }
        groups.put(group.getId(), group);
    }

    // Add expense to group
    public void addExpenseToGroup(String groupId, Expense expense) {

        Group group = groups.get(groupId);
        if (group == null) {
            throw new IllegalArgumentException("No group found with ID: " + groupId);
        }
        // add all the validations like users should belong to the given group.
        group.addExpense(expense);
    }

    // Retrieve a group
    public Group getGroup(String groupId) {
        return groups.get(groupId);
    }

    // Retrieve all groups
    public List<Group> getAllGroups() {
        return new ArrayList<>(groups.values());
    }

    @Override
    public void addObserver(ExpenseObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ExpenseObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyExpenseAdded(Expense expense) {

        for (ExpenseObserver observer : observers) {
            observer.onExpenseAdded(expense);
        }
    }

    @Override
    public void notifyExpenseUpdated(Expense expense) {

        for (ExpenseObserver observer : observers) {
            observer.onExpenseUpdated(expense);
        }
    }
}
