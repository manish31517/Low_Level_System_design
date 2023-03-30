package ParkingDesignPattern.Services;

import ParkingDesignPattern.Model.Ticket.Ticket;
import ParkingDesignPattern.Model.Vehicle.Vehicle;

public interface IBookParkingService {

    Ticket bookParking(int parkingGateNumber, Vehicle vehicle);
}
