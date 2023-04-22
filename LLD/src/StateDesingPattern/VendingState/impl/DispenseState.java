package StateDesingPattern.VendingState.impl;

import StateDesingPattern.Coin;
import StateDesingPattern.Item;
import StateDesingPattern.VendingMachine;
import StateDesingPattern.VendingState.State;

import java.util.List;

public class DispenseState implements State {
    public DispenseState(VendingMachine machin, int codeNumber) throws Exception{
        System.out.println("Curently Vending Machine is in DispenseState");
        dispenseProduct(machin,codeNumber);
    }
    @Override
    public  void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Insert coin button can not be clicked  on Dispense state");
    };

    @Override
    public  void clickOnStartProductiSelectionButton(VendingMachine vendingMachine) throws  Exception{
        throw new Exception("Produce selection can not be clicked in Dispense State");
    };

    @Override
    public  void insertCoin(VendingMachine vendingMachine, Coin coin) throws  Exception{
        throw  new Exception("You can not insert coin in Dispense state");
    }

    @Override
    public  void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws  Exception{
        throw  new Exception("You can not choose the product in Dispense state");
    }
    @Override
    public int getChange(int returnChangeMoney) throws  Exception{
        throw  new Exception("You can not get change in Dispense state");
    }
    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws  Exception{
        System.out.println("Product has been dispensed");
        Item item  = vendingMachine.getInventory().getItem(codeNumber);
        vendingMachine.getInventory().updateSoldItem(codeNumber);
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return item;
    }
    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws  Exception{
        throw  new Exception("You can not get refund in Idle state");
    }

    @Override
    public  void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws  Exception{
        throw  new Exception("You can not update the Inventory in dispense state");
    }
}
