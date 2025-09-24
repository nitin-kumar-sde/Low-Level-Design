package practise.splitwise.controller;

import practise.splitwise.model.Expense;
import practise.splitwise.model.Transaction;
import practise.splitwise.observer.ExpenseNotifier;
import practise.splitwise.observer.ExpenseObserver;
import practise.splitwise.service.BalanceService;

import java.util.*;

/**
 * Mimics repository layer for Expenses.
 */
public class ExpenseController implements ExpenseNotifier {

    private final List<ExpenseObserver> observers;
    private final BalanceService balanceService;
    private final List<Expense> expenses;

    public ExpenseController(BalanceService balanceService) {
        this.observers = new ArrayList<>();
        this.balanceService = balanceService;
        this.expenses = new ArrayList<>();
    }

    @Override
    public void addObserver(ExpenseObserver observer) {
        // validation
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

    public void addExpense(Expense expense) {
       // validate
        System.out.println("Expense Added -" + expense);
        expenses.add(expense);
        notifyExpenseAdded(expense);
    }


    public void updateExpense(final Expense expense) {
        // validation
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i).getId().equals(expense.getId())) {
                expenses.set(i, expense);
                notifyExpenseUpdated(expense);
                return;
            }
        }
        throw new IllegalArgumentException("Expense with ID " + expense.getId() + " not found.");
    }

    // Retrieves all expenses.
    public List<Transaction> getAllTransactions() {
        return balanceService.getOptimalTransactions();
    }
}
