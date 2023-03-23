package ParkingDesignPattern.Model.Parking;

import ParkingDesignPattern.Model.Gate.EntranceGate;
import ParkingDesignPattern.Model.Gate.ExistenceGate;
import ParkingDesignPattern.Model.Person.Person;

import java.util.List;

public class ParkingFloor {
    private int floorNo;
    List<ParkingSpot> parkingSpotList;
    List<Person> gaurd;
    List<EntranceGate> entranceGates;
    List<ExistenceGate> existenceGates;

    public ParkingFloor(int floorNo, List<ParkingSpot> parkingSpotList, List<Person> gaurd, List<EntranceGate> entranceGates, List<ExistenceGate> existenceGates) {
        this.floorNo = floorNo;
        this.parkingSpotList = parkingSpotList;
        this.gaurd = gaurd;
        this.entranceGates = entranceGates;
        this.existenceGates = existenceGates;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public List<Person> getGaurd() {
        return gaurd;
    }

    public void setGaurd(List<Person> gaurd) {
        this.gaurd = gaurd;
    }

    public List<EntranceGate> getEntranceGates() {
        return entranceGates;
    }

    public void setEntranceGates(List<EntranceGate> EntranceGates) {
        this.entranceGates = EntranceGates;
    }

    public List<ExistenceGate> getExistenceGates() {
        return existenceGates;
    }

    public void setExistenceGates(List<ExistenceGate> ExistenceGates) {
        this.existenceGates = existenceGates;
    }

    @Override
    public String toString() {
        return "ParkingFloor{" +
                "floorNo=" + floorNo +
                ", parkingSpotList=" + parkingSpotList +
                ", gaurd=" + gaurd +
                ", EntranceGates=" + entranceGates +
                ", ExistenceGates=" + existenceGates +
                '}';
    }
}
