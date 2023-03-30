package ParkingDesignPattern.Model.Vehicle;

import ParkingDesignPattern.Model.Person.VehicleOwner;

public class FourWheeler extends Vehicle{
    public FourWheeler(VehicleOwner vehicleOwner, String vehicleNumber){
        super(VehicleCategoryWithCost.FourWheeler,vehicleNumber,vehicleOwner);
    }
}
