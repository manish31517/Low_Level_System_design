package MovieBookingSystem;

import CarRentalSystem.Payment;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    Show show;
    List<Seat> seat = new ArrayList<>();
    Payment payment;

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<Seat> getSeat() {
        return seat;
    }

    public void setSeat(List<Seat> seat) {
        this.seat = seat;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
