package ParkingDesignPattern;

import ParkingDesignPattern.Model.Gate.EntranceGate;
import ParkingDesignPattern.Model.Gate.ExistenceGate;
import ParkingDesignPattern.Model.Parking.ParkingFloor;
import ParkingDesignPattern.Model.Parking.ParkingSpace;
import ParkingDesignPattern.Model.Parking.ParkingSpot;
import ParkingDesignPattern.Model.Person.*;
import ParkingDesignPattern.Model.Ticket.Ticket;
import ParkingDesignPattern.Model.Vehicle.TwoWheelerVehicle;
import ParkingDesignPattern.Model.Vehicle.Vehicle;
import ParkingDesignPattern.Model.Vehicle.VehicleCategoryWithCost;
import ParkingDesignPattern.Services.*;

import java.util.ArrayList;
import java.util.List;

public class ParkingApplication {
    public static void main(String [] args){
        ParkingSpace parkingSpace = ParkingSpace.getInstance();

        SystemService systemService = new SystemService(parkingSpace);

        TicketService ticketService = new TicketService();

        ParkingService parkingService = new ParkingService(parkingSpace,ticketService);

        ParkingSystemAdministrator parkingSystemAdministrator = new ParkingSystemAdministrator("Abc","22","abc/12","abc@gmail.com",systemService);

        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(new ParkingSpot(1,true, VehicleCategoryWithCost.TwoWheeler));
        parkingSpots.add(new ParkingSpot(2,true, VehicleCategoryWithCost.TwoWheeler));
        parkingSpots.add(new ParkingSpot(4,true, VehicleCategoryWithCost.FourWheeler));

        List<EntranceGate> entranceGates = new ArrayList<>();
        entranceGates.add(new EntranceGate(1,1,true,false));

        List<ExistenceGate> existenceGates = new ArrayList<>();
        existenceGates.add(new ExistenceGate(1,2,false,false));

        ParkingFloor parkingFloor = new ParkingFloor(1,parkingSpots,new ArrayList<>(),entranceGates,existenceGates);

        parkingSystemAdministrator.addParkingFloors(parkingFloor);

        ParkingEntryStaff parkingEntryStaff = new ParkingEntryStaff("shyamu","34","rasd/12","shyamu@gmail.com", new BookParkingService(parkingService));

        ParkingExitStaff parkingExitStaff = new ParkingExitStaff("ramu","24","ra/212","ramu@gmail.com",new FreeParkingService(parkingService));

        Vehicle omVehicle = new TwoWheelerVehicle(new VehicleOwner("om","34","om/12","om@gmail.com"),"UP66D3430");

        Ticket omTicket =  parkingEntryStaff.getBookParkingService().bookParking(1,omVehicle);

        System.out.println(ticketService.getTicketCollection());

        Double omFare = parkingExitStaff.getFreeParkingService().freeParking(omTicket);

        System.out.println("Total om fare is "+ omFare);

    }
}
