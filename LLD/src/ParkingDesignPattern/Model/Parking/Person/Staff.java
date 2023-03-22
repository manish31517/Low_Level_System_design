package ParkingDesignPattern.Model.Parking.Person;

public abstract  class  Staff extends Person{
    private  int parkingFloorNumber;
    public  Staff(String name, String age, String address, String emailId){
        super(name,age,address,emailId);
    }

    public int getParkingFloorNumber() {
        return parkingFloorNumber;
    }

    public void setParkingFloorNumber(int parkingFloorNumber) {
        this.parkingFloorNumber = parkingFloorNumber;
    }
}
