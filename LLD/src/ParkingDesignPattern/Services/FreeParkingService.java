package ParkingDesignPattern.Services;

import ParkingDesignPattern.Model.Ticket.Ticket;

public class FreeParkingService implements IFreeParkingService {
    private ParkingService parkingService;

    public FreeParkingService(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @Override
    public double freeParking(Ticket ticket){
        return parkingService.freeParking(ticket);
    }

}
