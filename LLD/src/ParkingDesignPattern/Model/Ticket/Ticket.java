package ParkingDesignPattern.Model.Ticket;

import ParkingDesignPattern.Model.Parking.ParkingSpot;
import ParkingDesignPattern.Model.Vehicle.Vehicle;

import java.util.Date;
import java.util.Vector;

public class Ticket {
    private int ticketId;
    private Vehicle vehicle;
    private  long entryTime;
    private  int parkingEntryGateNumber;
    private ParkingSpot parkingSpot;
    private TicketStatus ticketStatus;

    public Ticket(int ticketId, Vehicle vehicle, int parkingEntryGateNumber, ParkingSpot parkingSpot, TicketStatus ticketStatus) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.entryTime = new Date().getTime();
        this.parkingEntryGateNumber = parkingEntryGateNumber;
        this.parkingSpot = parkingSpot;
        this.ticketStatus = ticketStatus;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public int getParkingEntryGateNumber() {
        return parkingEntryGateNumber;
    }

    public void setParkingEntryGateNumber(int parkingEntryGateNumber) {
        this.parkingEntryGateNumber = parkingEntryGateNumber;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", vehicle=" + vehicle +
                ", entryTime=" + entryTime +
                ", parkingEntryGateNumber=" + parkingEntryGateNumber +
                ", parkingSpot=" + parkingSpot +
                ", ticketStatus=" + ticketStatus +
                '}';
    }
}
