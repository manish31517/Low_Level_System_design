package CarRentalSystem;

import CarRentalSystem.Product.Vehicle;

import java.util.Date;

public class Reservation {
    int reservationID;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickupLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public int createReserve(User user , Vehicle vehicle){
        reservationID = 122232;
        this.user = user;
        this.vehicle = vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;
         return reservationID;
    }

}
