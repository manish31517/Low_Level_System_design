package ATMDesign.AmountWithdrawal;

import ATMDesign.ATM;
import ATMDesign.ATMStates.CashWithdrawalState;

public class CashWithdrawalProcessor {
    CashWithdrawalProcessor nextCashWithdrawalProcessor;

    public CashWithdrawalProcessor( CashWithdrawalProcessor cashWithdrawalProcessor){
        nextCashWithdrawalProcessor = cashWithdrawalProcessor;
    }

    public  void withdraw(ATM atm , int remainingAmount){
        if(nextCashWithdrawalProcessor != null){
            nextCashWithdrawalProcessor.withdraw(atm,remainingAmount);
        }
    }

}
