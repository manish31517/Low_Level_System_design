package ParkingDesignPattern.Services;


import ParkingDesignPattern.Model.Gate.EntranceGate;
import ParkingDesignPattern.Model.Gate.Gate;
import ParkingDesignPattern.Model.Parking.ParkingFloor;
import ParkingDesignPattern.Model.Parking.ParkingSpace;
import ParkingDesignPattern.Model.Parking.ParkingSpot;
import ParkingDesignPattern.Model.Ticket.Ticket;
import ParkingDesignPattern.Model.Vehicle.Vehicle;

public class ParkingService implements  IBookParkingService,IFreeParkingService {
    private ParkingSpace parkingSpace;
    private TicketService ticketService;

    public ParkingService(ParkingSpace parkingSpace, TicketService ticketService) {
        this.parkingSpace = parkingSpace;
        this.ticketService = ticketService;
    }

    @Override
    public Ticket bookParking(int parkingGateNumber, Vehicle vehicle) {
        ParkingSpot parkingSpot = null;
        boolean parkingFound = false;
        for (int floor = 0; floor < parkingSpace.getParkingFloors().size(); floor++) {
            ParkingFloor parkingFloor = parkingSpace.getParkingFloors().get(floor);
            for (int i = 0; i < parkingFloor.getEntranceGates().size(); i++) {
                Gate gate = parkingFloor.getEntranceGates().get(i);
                if (gate.getGateNumber() == parkingGateNumber && gate.isOpened()) {
                    for (int j = 0; j < parkingFloor.getParkingSpotList().size(); j++) {
                        parkingSpot = parkingFloor.getParkingSpotList().get(j);
                        if (parkingSpot.getVehicleCategoryWithCost() == vehicle.getVehicleCategoryWithCost() && parkingSpot.isSpackeAvailableForParking()) {
                            parkingSpot.setVehicle(vehicle);
                            parkingSpot.setSpackeAvailableForParking(false);
                            parkingFound = true;
                            break;
                        }
                    }
                }
                if (parkingFound) break;
            }
            if (parkingFound) break;
        }
        return ticketService.getTicket(parkingGateNumber, parkingSpot, vehicle);
    }

    @Override
    public double freeParking(Ticket ticket) {
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        int parkingEntryGateNumber = ticket.getParkingEntryGateNumber();
        boolean parkingFreez = false;
        for (int floor = 0; floor < parkingSpace.getParkingFloors().size(); floor++) {
            ParkingFloor parkingFloor = parkingSpace.getParkingFloors().get(floor);
            for (int i = 0; i < parkingFloor.getEntranceGates().size(); i++) {
                if (parkingFloor.getEntranceGates().get(i).getGateNumber() == parkingEntryGateNumber) {
                    for (int j = 0; j < parkingFloor.getParkingSpotList().size(); j++) {
                        if (parkingSpot == parkingFloor.getParkingSpotList().get(j)) {
                            parkingSpot.freeTheParkingSpace();
                            parkingFreez = true;
                            break;
                        }
                    }

                }
                if (parkingFreez) break;
            }
            if (parkingFreez) break;

        }
        return ticketService.getParkingFare(ticket);
    }
}
