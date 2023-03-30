package ParkingDesignPattern.Model.Person;

import ParkingDesignPattern.Model.Gate.EntranceGate;
import ParkingDesignPattern.Services.IBookParkingService;

public class ParkingEntryStaff extends Staff{
    private EntranceGate entranceGate;
    private IBookParkingService bookParkingService;

    public EntranceGate getEntranceGate() {
        return entranceGate;
    }

    public void setEntranceGate(EntranceGate entranceGate) {
        this.entranceGate = entranceGate;
    }

    public IBookParkingService getBookParkingService() {
        return bookParkingService;
    }

    public void setBookParkingService(IBookParkingService bookParkingService) {
        this.bookParkingService = bookParkingService;
    }

    public ParkingEntryStaff(String name, String age, String address, String email, IBookParkingService bookParkingService){
        super(name,age,address,email);
        this.bookParkingService = bookParkingService;
    }
}
