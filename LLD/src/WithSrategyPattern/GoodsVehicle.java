package WithSrategyPattern;

import WithSrategyPattern.Strategy.XyDriveStrategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle(){
        super(new XyDriveStrategy());
    }

}
