package ParkingDesignPattern.Model.Vehicle;

public enum VehicleCategoryWithCost {
    TwoWheeler(10),
    FourWheeler(25);

    private int vehicleFare;

    VehicleCategoryWithCost(int fare){
        vehicleFare=fare;
    }

    public int getVehicleFare(){
        return vehicleFare;
    }


}
