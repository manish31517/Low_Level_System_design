package WithSrategyPattern;

import WithSrategyPattern.Strategy.SportDriveStrategy;
import WithSrategyPattern.Vehicle;

public class OffRoadVehicle extends Vehicle {
   public OffRoadVehicle(){
       super(new SportDriveStrategy());
   }

}
