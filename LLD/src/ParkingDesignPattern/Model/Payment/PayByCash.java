package ParkingDesignPattern.Model.Payment;

public class PayByCash extends CashPayment{
    public  PayByCash(){
        super(PaymentCategory.CASH);
    }
}
