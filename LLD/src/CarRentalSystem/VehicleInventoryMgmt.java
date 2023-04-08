package CarRentalSystem;

import CarRentalSystem.Product.Vehicle;
import CarRentalSystem.Product.VehicleType;

import java.util.List;
import java.util.stream.Collectors;

// It is scalable, we can extend it for particular vehicle inventory mgmt.
public class VehicleInventoryMgmt {
    List<Vehicle> vehicles;

    public VehicleInventoryMgmt(List<Vehicle> vehicles){
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return vehicles.stream().filter(vehicle -> vehicle.getVehicleType().equals(vehicleType)).collect(Collectors.toList());
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
