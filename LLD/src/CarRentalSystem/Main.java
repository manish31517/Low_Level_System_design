package CarRentalSystem;

import CarRentalSystem.Product.Vehicle;
import CarRentalSystem.Product.VehicleType;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicle();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(stores,users);
        //0. user comses
        User user = users.get(0);

        // 1. user search store based on the location
        Location loc = new Location("221404","Bhadohi","UTTAR PRADES","India");

        Store store = vehicleRentalSystem.getStore(loc);

        //2. get all vehicle you are intereseted in (based upon different filters)
        List<Vehicle> storeVehicle = store.getVehicles(VehicleType. CAR);

        //3. reserving the particular vehicle
        Reservation reservation = store.createReservation(storeVehicle.get(0),users.get(0));

        //4. generate the bill
        Bill bill = new Bill(reservation);

        //5. make payment
        Payment payment = new Payment();
        payment.payBill(bill);

        //6. trip completed, sumbit the vehicle and close the reservation
        store.completeReservation(reservation.reservationID);

    }

    public static List<User> addUsers(){
        List<User> user = new ArrayList<>();
        return user;
    }

    public  static  List<Store> addStores(List<Vehicle> vehicles){
        List<Store> stores = new ArrayList<>();
        return stores;
    }

    public static List<Vehicle> addVehicle(){
        List<Vehicle> vehicles = new ArrayList<>();
        return vehicles;
    }

}
