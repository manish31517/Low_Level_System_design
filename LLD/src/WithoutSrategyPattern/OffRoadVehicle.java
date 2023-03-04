package WithoutSrategyPattern;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive(){
        System.out.println("sports drive capability");
    }
}

//offRode and sports vehicle are using same code , which is not code reuseablity
