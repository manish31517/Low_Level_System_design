package ParkingDesignPattern.Model.Payment;

public class PayByUPI extends CashlessPayment{
    private long transactionId;
    public PayByUPI(){
        super(PaymentCategory.UPI);
    }
}
