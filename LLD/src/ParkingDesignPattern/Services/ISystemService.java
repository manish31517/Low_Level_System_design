package ParkingDesignPattern.Services;

import ParkingDesignPattern.Model.Parking.ParkingFloor;
import ParkingDesignPattern.Model.Parking.ParkingSpace;

public interface ISystemService {
    ParkingFloor addParkingFloor(ParkingFloor parkingFloor);
    ParkingSpace removeParkingFloor(int floorNumber);

    ParkingFloor addEntranceGate(int floorNumber ,int gateNumber);

    ParkingFloor addExitGate(int floorNumber,int gateNumber);

    ParkingFloor removeEntranceGate(int floorNumber, int gateNumber);
    public ParkingFloor removeExitGate(int floorNo, int gateNo);
    ParkingFloor getParkingInformation(int floorNumber);
}
