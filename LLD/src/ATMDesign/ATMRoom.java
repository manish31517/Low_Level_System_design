package ATMDesign;

import NullDesingPattern.Car;
import com.sun.jdi.connect.Connector;

public class ATMRoom {
    ATM atm;
    User user;
    public  static  void main(String [] args){
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initilaize();

        atmRoom.atm.printCurrentATMStatus();
        atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm,atmRoom.user.card);
        atmRoom.atm.getCurrentATMState().authenticatePin(atmRoom.atm,atmRoom.user.card,112211);
        atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm,atmRoom.user.card, TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getCurrentATMState().cashWithdrawal(atmRoom.atm,atmRoom.user.card,2700);
        atmRoom.atm.printCurrentATMStatus();
    }

    public void initilaize(){
        atm = ATM.getAtmObject();
        atm.setAtmBalance(3500,1,2,5);

        this.user = createUser();
    }

    public  User createUser(){
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard(){
        Card card= new Card();
        card.setUserBankAccount(createBankAccount());
        return card;
    }

    private  UserBankAccount createBankAccount(){
        UserBankAccount userBankAccount = new UserBankAccount();
        userBankAccount.setBalance(5000);
        return userBankAccount;
    }

}
