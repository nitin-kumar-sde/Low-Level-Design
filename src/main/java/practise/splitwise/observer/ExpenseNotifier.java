package practise.splitwise.observer;

import practise.splitwise.model.Expense;

public interface ExpenseNotifier {
    /**
     * Adds an observer to the notification list.
     * @param observer The observer to add.
     */
    void addObserver(ExpenseObserver observer);

    /**
     * Removes an observer from the notification list.
     * @param observer The observer to remove.
     */
    void removeObserver(ExpenseObserver observer);

    /**
     * Notifies all observers about a newly added expense.
     * @param expense The expense that was added.
     */
    void notifyExpenseAdded(Expense expense);

    /**
     * Notifies all observers about an updated expense.
     * @param expense The expense that was updated.
     */
    void notifyExpenseUpdated(Expense expense);
}

