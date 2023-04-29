package ATMDesign;

public class UserBankAccount {
    int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public  void withdrawalBalance(int amount){
        balance = balance - amount;
    }
}
