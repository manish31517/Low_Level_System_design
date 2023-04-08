package CarRentalSystem;

import CarRentalSystem.Product.Vehicle;
import CarRentalSystem.Product.VehicleType;

import java.util.List;

public class Store {
    int storeID;
    VehicleInventoryMgmt inventoryMgmt;
    Location storeLocation;
    List<Reservation> reservations;

    public void setVehicles(List<Vehicle> vehicles) {
        this.inventoryMgmt = new VehicleInventoryMgmt(vehicles);
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType){
        return inventoryMgmt.getVehicles(vehicleType);
    }

    public  Reservation createReservation(Vehicle vehicle , User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }
    public boolean completeReservation(int reservationID){
        //take out the reservation from the list and call complete the reservation method
        return true;
    }
}
