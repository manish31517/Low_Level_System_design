package WithSrategyPattern;

import WithSrategyPattern.Strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SportDriveStrategy());
    }
}
