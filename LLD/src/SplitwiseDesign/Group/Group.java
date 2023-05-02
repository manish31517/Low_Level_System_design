package SplitwiseDesign.Group;

import SplitwiseDesign.Expense.Expense;
import SplitwiseDesign.Expense.ExpenseController;
import SplitwiseDesign.Expense.Split.ExpenseSplit;
import SplitwiseDesign.Expense.Split.Split;
import SplitwiseDesign.Expense.SplitType;
import SplitwiseDesign.User.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupId;
    String groupName;
    List<User> groupMembers;
    ExpenseController expenseController;
    List<Expense> expenseList;

    public  Group(){
        groupMembers = new ArrayList<>();
        expenseController = new ExpenseController();
        expenseList = new ArrayList<>();
    }

    //add member into group
    public  void addMember(User user){
        groupMembers.add(user);
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public  Expense createExpense(String expenseId, String description, double expenseAmount, List<Split> splitDetails, SplitType splitType, User paidByUser) throws Exception{
        Expense expense = expenseController.createExpense(expenseId,description,expenseAmount,splitDetails,splitType,paidByUser);
        expenseList.add(expense);
        return expense;
    }
}
