package ParkingDesignPattern.Model.Person;

import ParkingDesignPattern.Model.Parking.ParkingFloor;
import ParkingDesignPattern.Services.ISystemService;

public class ParkingSystemAdministrator extends Admin{
    private ISystemService systemService;
    public  ParkingSystemAdministrator(String name, String age, String addres, String emailID, ISystemService systemService){
        super(name,age,addres,emailID);
        this.systemService=systemService;
    }

    public void addParkingFloors(ParkingFloor parkingFloor){
        systemService.addParkingFloor(parkingFloor);
    }

    public  void addExitGate(int floorNumber ,int gateNumber){
        systemService.addExitGate(floorNumber,gateNumber);
    }
    public  void addEntryGate(int floorNumber, int gateNumber){
        systemService.addEntranceGate(floorNumber,gateNumber);
    }
    public void removeEntranceGate(int floorNumber, int gateNumber){
        systemService.removeEntranceGate(floorNumber,gateNumber);
    }

    public  void removeExitGate(int floorNumber, int gateNumber){
        systemService.removeExitGate(floorNumber,gateNumber);
    }
    @Override
    public ParkingFloor getFloorInformation(int floorNumber) {
        return systemService.getParkingInformation(floorNumber);
    }
}
