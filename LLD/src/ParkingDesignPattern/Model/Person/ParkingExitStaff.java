package ParkingDesignPattern.Model.Person;

import ParkingDesignPattern.Model.Gate.ExistenceGate;
import ParkingDesignPattern.ParkingApplication;
import ParkingDesignPattern.Services.IBookParkingService;
import ParkingDesignPattern.Services.IFreeParkingService;

public class ParkingExitStaff extends Staff{
    private IFreeParkingService freeParkingService;
    private ExistenceGate gate;

    public ParkingExitStaff(String name, String age, String address, String email, IFreeParkingService freeParkingService){
        super(name,age,address,email);
        this.freeParkingService = freeParkingService;
    }

    public IFreeParkingService getFreeParkingService() {
        return freeParkingService;
    }

    public void setFreeParkingService(IFreeParkingService freeParkingService) {
        this.freeParkingService = freeParkingService;
    }

    public ExistenceGate getGate() {
        return gate;
    }

    public void setGate(ExistenceGate gate) {
        this.gate = gate;
    }
}
