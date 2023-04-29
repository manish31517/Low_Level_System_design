package ATMDesign.ATMStates;

import ATMDesign.ATM;
import ATMDesign.Card;
import ATMDesign.TransactionType;

public class SelectOperationState extends ATMState{
    public SelectOperationState(){
        showOperation();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
             switch (transactionType){
                 case CASH_WITHDRAWAL :
                     atm.setCurrentATMState(new CashWithdrawalState());
                     break;
                 case BALANCE_CHEK:
                     atm.setCurrentATMState(new CheckBalanceSTate());
                     break;
                 default:{
                     System.out.println("Invalid Option");
                     exit(atm);
                 }
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
        System.out.println("Please Collect your card");
    }

    private void showOperation(){
        System.out.println("Please Select Your Operation");
        TransactionType.showAllTransactionTypes();
    }
}
