package ParkingDesignPattern.Services;

import ParkingDesignPattern.Model.Parking.ParkingSpot;
import ParkingDesignPattern.Model.Person.Person;
import ParkingDesignPattern.Model.Ticket.Ticket;
import ParkingDesignPattern.Model.Ticket.TicketStatus;
import ParkingDesignPattern.Model.Vehicle.Vehicle;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class TicketService {
    HashMap<Person, Ticket> ticketCollection = new HashMap<>();

    public Ticket getTicket(int parkingEntryGateNumber, ParkingSpot parkingSpot, Vehicle vehicle){
        Ticket ticket = new Ticket(new Random().nextInt(),vehicle,parkingEntryGateNumber,parkingSpot, TicketStatus.BOOKED);
        ticketCollection.put(vehicle.getvehicleOwner(),ticket);
        return ticket;
    }

    public double getParkingFare(Ticket ticket){
        long now = new Date().getTime();
        int fareprice = ticket.getVehicle().getVehicleCategoryWithCost().getVehicleFare();
        ticketCollection.remove(ticket.getVehicle().getvehicleOwner());
        return (now-ticket.getEntryTime())*fareprice;
    }


    public HashMap<Person, Ticket> getTicketCollection() {
        return ticketCollection;
    }
}
