package SplitwiseDesign.Expense;

import SplitwiseDesign.BalanceSheetController;
import SplitwiseDesign.Expense.Split.ExpenseSplit;
import SplitwiseDesign.Expense.Split.Split;
import SplitwiseDesign.User.User;

import java.util.List;

public class ExpenseController {
  BalanceSheetController balanceSheetController;

    public ExpenseController() {
        this.balanceSheetController = new BalanceSheetController();
    }

    public  Expense createExpense(String id, String description, double expenseAmount, List<Split> splitDetails, SplitType splitType, User paidByUser) throws  Exception{
        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense  = new Expense(id, description,expenseAmount,paidByUser,splitType,splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);
        return  expense;
    }
}
