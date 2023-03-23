package ParkingDesignPattern.Model.Person;

public abstract  class Gaurd extends Person{
    private  int parkingFloorNumber;
    public  Gaurd(String name, String age, String address, String emailId){
        super(name,age,address,emailId);
    }

    public int getParkingFloorNumber() {
        return parkingFloorNumber;
    }

    public void setParkingFloorNumber(int parkingFloorNumber) {
        this.parkingFloorNumber = parkingFloorNumber;
    }
}
