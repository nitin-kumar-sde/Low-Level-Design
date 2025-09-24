package practise.splitwise;

import practise.splitwise.controller.ExpenseController;
import practise.splitwise.factory.SplitFactory;
import practise.splitwise.model.Expense;
import practise.splitwise.model.Transaction;
import practise.splitwise.model.User;
import practise.splitwise.service.BalanceService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        User u1 = new User(123, "Alice");
        User u2 = new User(456, "Bob");
        User u3 = new User(789, "Charlie");

        BalanceService balanceService = new BalanceService();
        ExpenseController expenseController = new ExpenseController(balanceService);
        expenseController.addObserver(balanceService);

        Expense e1 = new Expense(123,"lunch",
                 300.0, u1, List.of(u1, u2, u3), SplitFactory.createSplit(
                         SplitFactory.SplitType.EQUAL
        ), null);


        Expense e2 = new Expense(456,"dinner",
                500.0, u1, List.of(u1, u2, u3), SplitFactory.createSplit(
                SplitFactory.SplitType.EQUAL
        ), null);
        expenseController.addExpense(e1);
        expenseController.addExpense(e2);

        final List<Transaction> allTransactions = expenseController
                .getAllTransactions();

        for(Transaction transaction : allTransactions) {
            System.out.println(transaction);
        }
    }

}
