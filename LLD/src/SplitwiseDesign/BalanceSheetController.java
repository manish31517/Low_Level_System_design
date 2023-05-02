package SplitwiseDesign;

import SplitwiseDesign.Expense.Split.Split;
import SplitwiseDesign.User.User;

import java.util.List;
import java.util.Map;

public class BalanceSheetController {

    public  void updateUserExpenseBalanceSheet(User paidByUser, List<Split> splitDetails, double expenseAmount){

        //update the total amount paid of the expense by user
        UserExpenseBalanceSheet paidByUserExpenseSheet = paidByUser.getUserExpenseBalanceSheet();
        paidByUserExpenseSheet.setTotalPayment(paidByUserExpenseSheet.getTotalPayment() + expenseAmount);

        for(Split split : splitDetails){
            User userOwe = split.getUser();
            UserExpenseBalanceSheet oweUserExpneseSheet = userOwe.getUserExpenseBalanceSheet();
            double oweAmount = split.getAmountOwe();

            if(paidByUser.getUserId().equals(userOwe.getUserId())){
                paidByUserExpenseSheet.setTotalYourExpense(paidByUserExpenseSheet.getTotalYourExpense() + oweAmount);
            }
            else{
                paidByUserExpenseSheet.setTotalYouGetBack(paidByUserExpenseSheet.getTotalYouGetBack() + oweAmount);

                Balance userOweBalance;
                if(paidByUserExpenseSheet.getUserVsBalance().containsKey(userOwe.getUserId())){
                    userOweBalance = paidByUserExpenseSheet.getUserVsBalance().get(userOwe.getUserId());
                }
                else{
                    userOweBalance = new Balance();
                    paidByUserExpenseSheet.getUserVsBalance().put(userOwe.getUserId(), userOweBalance);
                }
                userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack() + oweAmount);

                //update the balance sheet of owe user
                oweUserExpneseSheet.setTotalYouOwe(oweUserExpneseSheet.getTotalYouOwe() + oweAmount);
                oweUserExpneseSheet.setTotalYourExpense(oweUserExpneseSheet.getTotalYourExpense() + oweAmount);

                Balance userPaidBalance;
                if(oweUserExpneseSheet.getUserVsBalance().containsKey(paidByUser.getUserId())){
                    userPaidBalance =  oweUserExpneseSheet.getUserVsBalance().get(paidByUser.getUserId());
                }
                else{
                    userPaidBalance = new Balance();
                    oweUserExpneseSheet.getUserVsBalance().put(paidByUser.getUserId(), userPaidBalance);
                }
                userPaidBalance.setAmountGetBack(userPaidBalance.getAmoutOwe()  + oweAmount);

            }
        }

    }


    public void  showBalanceSheetOfUser(User user){
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Balance Sheet of user : "+ user.getUserId());

        UserExpenseBalanceSheet userExpenseBalanceSheet1 = user.getUserExpenseBalanceSheet();
        System.out.println("TotalYourExpense: "+userExpenseBalanceSheet1.getTotalYourExpense());
        System.out.println("TotalGetBack: "+userExpenseBalanceSheet1.getTotalYouGetBack());
        System.out.println("TotalYourOwe: "+userExpenseBalanceSheet1.getTotalYouOwe());
        System.out.println("TotalPaymentMade: "+ userExpenseBalanceSheet1.getTotalPayment());

        for(Map.Entry<String, Balance> entry : userExpenseBalanceSheet1.getUserVsBalance().entrySet()){
            String userId = entry.getKey();
            Balance balance = entry.getValue();
            System.out.println("userID: "+ userId + "YouGetBack: "+ balance.getAmountGetBack()+ "YouOwe: "+balance.getAmoutOwe());
        }
        System.out.println("--------------------------------------------------------------------------------");

    }
}
