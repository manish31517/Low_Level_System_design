package ParkingDesignPattern.Model.Vehicle;

import ParkingDesignPattern.Model.Person.VehicleOwner;

public class TwoWheelerVehicle extends Vehicle{
     public TwoWheelerVehicle(VehicleOwner vehicleOwner, String vehicleNumber){
         super(VehicleCategoryWithCost.TwoWheeler,vehicleNumber,vehicleOwner);
     }

}
