package ParkingDesignPattern.Model.Vehicle;

import ParkingDesignPattern.Model.Person.Person;

public class Vehicle {
    VehicleCategoryWithCost vehicleCategoryWithCost;
    String vehicleNumber;
    Person vehicleOwner;

    public Vehicle(VehicleCategoryWithCost vehicleCategoryWithCost, String vehicleNumber,Person  vehicleOwner) {
        this.vehicleCategoryWithCost = vehicleCategoryWithCost;
        this.vehicleNumber = vehicleNumber;
        this.vehicleOwner = vehicleOwner;
    }

    public VehicleCategoryWithCost getVehicleCategoryWithCost() {
        return vehicleCategoryWithCost;
    }

    public void setVehicleCategoryWithCost(VehicleCategoryWithCost vehicleCategoryWithCost) {
        this.vehicleCategoryWithCost = vehicleCategoryWithCost;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Person getvehicleOwner() {
        return vehicleOwner;
    }

    public void setvehicleOwner(Person vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleCategoryWithCost=" + vehicleCategoryWithCost +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", VehicleOwner='" + vehicleOwner + '\'' +
                '}';
    }
}
