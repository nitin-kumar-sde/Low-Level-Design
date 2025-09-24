package practise.splitwise.observer;

import practise.splitwise.model.Expense;

public interface ExpenseObserver {

    void onExpenseAdded(Expense expense);

    void onExpenseUpdated(Expense expense);
}
