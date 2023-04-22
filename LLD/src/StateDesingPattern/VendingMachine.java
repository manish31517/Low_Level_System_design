package StateDesingPattern;

import StateDesingPattern.VendingState.State;
import StateDesingPattern.VendingState.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    State vendingMachineState;
    Inventory inventory;
    List<Coin> coins;

     public  VendingMachine(){
         vendingMachineState = new IdleState();
         coins = new ArrayList<>();
         inventory = new Inventory(10);
     }
    public State getVendingMachineState() {
        return  vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coins;
    }

    public void setCoinList(List<Coin> coins) {
        this.coins = coins;
    }
}
