package ParkingDesignPattern.Model.Vehicle;

public class TwoWheelerVehicle extends Vehicle{
     public TwoWheelerVehicle(String vehicleOwner, String vehicleNumber){
         super(VehicleCategoryWithCost.TwoWheeler,vehicleNumber,vehicleOwner);
     }

}
