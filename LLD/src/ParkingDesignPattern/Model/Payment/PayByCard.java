package ParkingDesignPattern.Model.Payment;

public class PayByCard extends CashlessPayment{
  public  PayByCard(){
      super(PaymentCategory.CARD);
  }
}
