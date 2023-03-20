package ParkingDesignPattern.Model.Parking;

import ParkingDesignPattern.Model.Vehicle.Vehicle;
import ParkingDesignPattern.Model.Vehicle.VehicleCategoryWithCost;

public class ParkingSpot {
    private int spotNumber;
    private Vehicle vehicle;
    private boolean isSpackeAvailableForParking;
    private VehicleCategoryWithCost vehicleCategoryWithCost;

    public ParkingSpot(int spotNumber, Vehicle vehicle, boolean isSpackeAvailableForParking, VehicleCategoryWithCost vehicleCategoryWithCost) {
        this.spotNumber = spotNumber;
        this.vehicle = vehicle;
        this.isSpackeAvailableForParking = isSpackeAvailableForParking;
        this.vehicleCategoryWithCost = vehicleCategoryWithCost;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    void freeTheParkingSpace(){
        vehicle=null;
        isSpackeAvailableForParking=true;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean isSpackeAvailableForParking() {
        return isSpackeAvailableForParking;
    }

    public VehicleCategoryWithCost getVehicleCategoryWithCost() {
        return vehicleCategoryWithCost;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setSpackeAvailableForParking(boolean spackeAvailableForParking) {
        isSpackeAvailableForParking = spackeAvailableForParking;
    }

    public void setVehicleCategoryWithCost(VehicleCategoryWithCost vehicleCategoryWithCost) {
        this.vehicleCategoryWithCost = vehicleCategoryWithCost;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", vehicle=" + vehicle +
                ", isSpackeAvailableForParking=" + isSpackeAvailableForParking +
                ", vehicleCategoryWithCost=" + vehicleCategoryWithCost +
                '}';
    }
}
