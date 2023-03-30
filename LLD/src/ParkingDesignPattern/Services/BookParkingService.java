package ParkingDesignPattern.Services;

import ParkingDesignPattern.Model.Ticket.Ticket;
import ParkingDesignPattern.Model.Vehicle.Vehicle;

public class BookParkingService implements IBookParkingService{
    ParkingService parkingService;

    public BookParkingService(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @Override
    public Ticket bookParking(int parkingGateNumber, Vehicle vehicle){

        return parkingService.bookParking(parkingGateNumber,vehicle);
    }
}
