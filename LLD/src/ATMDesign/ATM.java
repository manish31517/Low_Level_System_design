package ATMDesign;

import ATMDesign.ATMStates.ATMState;
import ATMDesign.ATMStates.IdleState;

public class ATM {
    private  static  ATM atm = new ATM(); //Singletone eager initialization
    ATMState currentATMState;
    
    private   int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;
    
    private  ATM(){
        
    }
    
    public  static  ATM getAtmObject(){
        atm.setCurrentATMState(new IdleState());
        return atm;
    }

    public ATMState getCurrentATMState() {
        return currentATMState;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public void deductTwoThousandNotes(int number) {
        noOfTwoThousandNotes = noOfTwoThousandNotes - number;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public void deductFiveHundredNotes(int number) {
         noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void setAtmBalance(int atmBalance ,int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes){
        this.atmBalance = atmBalance;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }

    public  void deductATMBalance(int amount){
        atmBalance -= amount;
    }
    public  void printCurrentATMStatus(){
        System.out.println("Balance " + this.atmBalance );
        System.out.println("2KNotes " + noOfTwoThousandNotes);
        System.out.println("500Notes "+ noOfFiveHundredNotes);
        System.out.println("100Notes "+ noOfOneHundredNotes);
    }

    public void setCurrentATMState(ATMState currentATMState) {
        this.currentATMState = currentATMState;
    }
}
