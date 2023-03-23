package ParkingDesignPattern.Model.Payment;

public abstract  class CashPayment extends Payment{
    public CashPayment(PaymentCategory paymentCategory){
        super(paymentCategory);
    }
}
