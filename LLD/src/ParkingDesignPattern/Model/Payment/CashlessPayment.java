package ParkingDesignPattern.Model.Payment;

public abstract class CashlessPayment extends Payment{

    public CashlessPayment(PaymentCategory paymentCategory){
        super(paymentCategory);
    }
}
