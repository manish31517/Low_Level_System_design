package SplitwiseDesign;
import java.util.HashMap;
import java.util.Map;
public class UserExpenseBalanceSheet {
    Map<String,Balance> userVsBalance;
    double totalPayment;
    double totalYouOwe;
    double totalYouGetBack;
    double totalYourExpense;

    public UserExpenseBalanceSheet(){
        userVsBalance = new HashMap<>();
        totalPayment = 0;
        totalYouOwe = 0;
        totalYouGetBack = 0;
        totalYourExpense = 0;
    }

    public  Map<String, Balance> getUserVsBalance(){
        return userVsBalance;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public double getTotalYouOwe() {
        return totalYouOwe;
    }

    public void setTotalYouOwe(double totalYouOwe) {
        this.totalYouOwe = totalYouOwe;
    }

    public double getTotalYouGetBack() {
        return totalYouGetBack;
    }

    public void setTotalYouGetBack(double totalYouGetBack) {
        this.totalYouGetBack = totalYouGetBack;
    }

    public double getTotalYourExpense() {
        return totalYourExpense;
    }

    public void setTotalYourExpense(double totalYourExpense) {
        this.totalYourExpense = totalYourExpense;
    }
}
