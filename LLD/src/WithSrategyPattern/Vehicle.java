package WithSrategyPattern;

import WithSrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;
    //costrctor-injection
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
