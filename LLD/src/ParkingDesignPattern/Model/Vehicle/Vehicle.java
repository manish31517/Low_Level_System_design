package ParkingDesignPattern.Model.Vehicle;

public class Vehicle {
    VehicleCategoryWithCost vehicleCategoryWithCost;
    String vehicleNumber;
    String vehicleOwner;

    public Vehicle(VehicleCategoryWithCost vehicleCategoryWithCost, String vehicleNumber, String vehicleOwner) {
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

    public String getvehicleOwner() {
        return vehicleOwner;
    }

    public void setvehicleOwner(String vehicleOwner) {
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
