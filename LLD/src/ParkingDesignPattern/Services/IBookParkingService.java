package ParkingDesignPattern.Services;

import ParkingDesignPattern.Model.Vehicle.Vehicle;
import sun.security.krb5.internal.Ticket;

public interface IBookParkingService {

    Ticket bookParking(int parkingGateNumber, Vehicle vehicle);
}
