package WithSrategyPattern.Strategy;

import WithSrategyPattern.Vehicle;

public class OffRoadVehicle extends Vehicle {
   public OffRoadVehicle(){
       super(new SportDriveStrategy());
   }

}
