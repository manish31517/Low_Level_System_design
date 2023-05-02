package SplitwiseDesign.Expense.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit{
    @Override
    public void validateSplitRequest(List<Split> splitList, double totalAmount) throws  Exception {

        double amountShouldBePersent = totalAmount /splitList.size();
        for(Split split : splitList){
            if(split.getAmountOwe() != amountShouldBePersent){
                throw  new Exception("Invalide Request");
            }
        }
    }
}
