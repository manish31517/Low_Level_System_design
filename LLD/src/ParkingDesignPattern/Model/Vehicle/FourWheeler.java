package ParkingDesignPattern.Model.Vehicle;

public class FourWheeler extends Vehicle{
    public FourWheeler(String vehicleOwner, String vehicleNumber){
        super(VehicleCategoryWithCost.FourWheeler,vehicleNumber,vehicleOwner);
    }
}
