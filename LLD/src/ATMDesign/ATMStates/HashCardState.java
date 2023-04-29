package ATMDesign.ATMStates;

import ATMDesign.ATM;
import ATMDesign.Card;

public class HashCardState extends ATMState{
    public  HashCardState(){
        System.out.println("Enter your card pin number");
    }
    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        boolean isCorrentPinEntered = card.isCorrectPINEntered(pin);

        if(isCorrentPinEntered){
            atm.setCurrentATMState(new SelectOperationState());
        }
        else{
            System.out.println("Invalid PIN Number");
             exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit Happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
