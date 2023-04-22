package StateDesingPattern.VendingState.impl;

import StateDesingPattern.Coin;
import StateDesingPattern.Item;
import StateDesingPattern.VendingMachine;
import StateDesingPattern.VendingState.State;

import java.util.HashMap;
import java.util.List;

public class HashMoneyState implements State {
   public HashMoneyState(){
       System.out.println("Currently Vending Machine is in HashMoneyState");
   }

    @Override
    public  void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception{
        return;
    };

    @Override
    public  void clickOnStartProductiSelectionButton(VendingMachine vendingMachine) throws  Exception{
         vendingMachine.setVendingMachineState( new SelectionState());
    };

    @Override
    public  void insertCoin(VendingMachine vendingMachine, Coin coin) throws  Exception{
        System.out.println("Accepted the coin");
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    public  void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws  Exception{
        throw  new Exception("You need to click on start product selection button first");
    }
    @Override
    public int getChange(int returnChangeMoney) throws  Exception{
        throw  new Exception("You can not get change in hash money state");
    }
    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws  Exception{
        throw  new Exception("You can not get product in hash money state");
    }
    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws  Exception{
        System.out.println("Returned the full amount back in the coin Dispense Tray");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();
    }

    @Override
    public  void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws  Exception{
        throw  new Exception("You can not update the inventory in hasMoney state");
    }


}
