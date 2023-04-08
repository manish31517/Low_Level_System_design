package CarRentalSystem;

public class Bill {
    Reservation reservation;
    double tootalBillAmount;
    boolean isBillPaid;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.tootalBillAmount = computeBillAmount();
        this.isBillPaid = false;
    }

    private double computeBillAmount(){
        return 100.0;
    }
}
