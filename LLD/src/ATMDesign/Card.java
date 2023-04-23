package ATMDesign;

public class Card {
    private int cardNumber;
    private int cvv;
    private int expiryDate;
    static int PIN_NUMBER = 1122211;

    private UserBankAccount userBankAccount;

    public  boolean isCorrectPINEntered(int pin){
        if(pin == PIN_NUMBER)return true;

        return false;
    }

    public  int getBankBalance(){
        return userBankAccount.balance;
    }

    public void deductBankBalance(int amount){
        userBankAccount.withdrawalBalance(amount);
    }

    public void setUserBankAccount(UserBankAccount userBankAccount) {
        this.userBankAccount = userBankAccount;
    }
}
