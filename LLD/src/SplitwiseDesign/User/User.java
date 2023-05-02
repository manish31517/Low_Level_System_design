package SplitwiseDesign.User;

import SplitwiseDesign.UserExpenseBalanceSheet;

public class User {
    String userId;
    String name;
    UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(String id, String name) {
        this.userId = id;
        this.name = name;
        this.userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }

    public String getUserId(){
        return userId;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }
}
