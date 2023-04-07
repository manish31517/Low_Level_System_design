package NullDesingPattern;

public class VehicleFactory {
    public static Vehicle getVehiclObject(String typeOfVehilce){
        if(typeOfVehilce.equals("CAR")){
            return new Car();
        }
        return new NullVehicle();
    }
}
