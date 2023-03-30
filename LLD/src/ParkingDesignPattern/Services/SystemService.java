package ParkingDesignPattern.Services;

import ParkingDesignPattern.Model.Parking.ParkingFloor;
import ParkingDesignPattern.Model.Parking.ParkingSpace;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SystemService implements ISystemService{
    ParkingSpace parkingSpace;

    public SystemService(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }
   @Override
    public ParkingFloor addParkingFloor(ParkingFloor parkingFloor){
        List<ParkingFloor> parkingFloorList = parkingSpace.getParkingFloors();
        if(parkingFloorList == null){
            parkingFloorList = new ArrayList<>();
        }
        parkingFloorList.add(parkingFloor);
        parkingSpace.setParkingFloors(parkingFloorList);
        return parkingFloor;
   }
   @Override
   public ParkingSpace removeParkingFloor(int floorNumber){
        return null;
   }

    @Override
   public ParkingFloor addEntranceGate(int floorNumber ,int gateNumber){
        return null;
    }
    @Override
    public ParkingFloor addExitGate(int floorNumber,int gateNumber){
        return null;
    }
    @Override
    public ParkingFloor removeEntranceGate(int floorNumber, int gateNumber){
        return  null;
    }
    @Override
    public ParkingFloor getParkingInformation(int floorNumber){
        return parkingSpace.getParkingFloors().stream().filter(parkingFloor -> parkingFloor.getFloorNo()==floorNumber).collect(Collectors.toList()).get(0);
    }

    @Override
    public ParkingFloor removeExitGate(int floorNo, int gateNo){
        return null;
    }
}
