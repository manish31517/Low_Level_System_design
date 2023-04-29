package ATMDesign.ATMStates;

import ATMDesign.ATM;
import ATMDesign.Card;

public class CheckBalanceSTate extends ATMState{
    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your Balance is "+card.getBankBalance());
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit Happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please Collect Your card");
    }
}
