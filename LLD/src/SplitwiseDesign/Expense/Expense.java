package SplitwiseDesign.Expense;

import SplitwiseDesign.Expense.Split.Split;
import SplitwiseDesign.User.User;

import java.util.ArrayList;
import java.util.List;

public class Expense {
    String id;
    String description;
    double expenseAmount;
    User paidByUser;
    SplitType splitType;
    List<Split> splitDetails = new ArrayList<>();

    public Expense(String id, String description, double expenseAmount, User paidByUser, SplitType splitType, List<Split> splitDetails) {
        this.id = id;
        this.description = description;
        this.expenseAmount = expenseAmount;
        this.paidByUser = paidByUser;
        this.splitType = splitType;
        this.splitDetails = splitDetails;
    }
}
