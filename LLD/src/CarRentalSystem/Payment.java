package CarRentalSystem;

public class Payment {
    Bill bill;
    public  void payBill(Bill bill){
        //do payment processing and update the bill status
        bill.isBillPaid = true;
    }

}
