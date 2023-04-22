package StateDesingPattern.VendingState.impl;

import StateDesingPattern.Coin;
import StateDesingPattern.Item;
import StateDesingPattern.VendingMachine;
import StateDesingPattern.VendingState.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public  IdleState(){
        System.out.println("Currently Vending Machine is in IdleState");
    }

    public  IdleState(VendingMachine vendingMachine){
        System.out.println("Currently Vending machine is in IdleState");
        vendingMachine.setCoinList(new ArrayList<>());
    }
    @Override
    public  void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception{
       vendingMachine.setVendingMachineState(new HashMoneyState());
    };

    @Override
    public  void clickOnStartProductiSelectionButton(VendingMachine vendingMachine) throws  Exception{
        throw new Exception("First you need to click on insert coin button");
    };

    @Override
    public  void insertCoin(VendingMachine vendingMachine, Coin coin) throws  Exception{
        throw  new Exception("You can not insert coin in idle state");
    }

    @Override
    public  void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws  Exception{
        throw  new Exception("You can not choose the product in idle state");
    }
    @Override
    public int getChange(int returnChangeMoney) throws  Exception{
        throw  new Exception("You can not get change in Idle state");
    }
    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws  Exception{
        throw  new Exception("You can not get product in Idle state");
    }
    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws  Exception{
        throw  new Exception("You can not get refund in Idle state");
    }

    @Override
    public  void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws  Exception{
        vendingMachine.getInventory().addItem(item, codeNumber);
    }
}
