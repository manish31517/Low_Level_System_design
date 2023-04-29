package ATMDesign.ATMStates;

import ATMDesign.ATM;
import ATMDesign.AmountWithdrawal.CashWithdrawalProcessor;
import ATMDesign.AmountWithdrawal.FiveHundredWithdrawProcessor;
import ATMDesign.AmountWithdrawal.OneHundredWithdrawProcessor;
import ATMDesign.AmountWithdrawal.TwoThousandWithdrawProcessor;
import ATMDesign.Card;

public class CashWithdrawalState extends ATMState{
   public CashWithdrawalState(){
       System.out.println("Please Enter the withdrawal Amount");
   }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount) {
       if(atm.getAtmBalance() < withdrawAmount){
           System.out.println("Insufficient fund in ATM machine");
       }
       else if(card.getBankBalance() < withdrawAmount){
           System.out.println("Insufficient fund in your account");
       }
       else{
           card.deductBankBalance(withdrawAmount);
           atm.deductATMBalance(withdrawAmount);

           CashWithdrawalProcessor withdrawalProcessor = new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

           withdrawalProcessor.withdraw(atm,withdrawAmount);

       }
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
