package StateDesingPattern.VendingState.impl;

import StateDesingPattern.Coin;
import StateDesingPattern.Item;
import StateDesingPattern.VendingMachine;
import StateDesingPattern.VendingState.State;

import java.util.List;

public class SelectionState implements State {
    public  void SelectionState(){
        System.out.println("Currently Vending Machine is in selection state");
    }
    @Override
    public  void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception{
      return;
    };

    @Override
    public  void clickOnStartProductiSelectionButton(VendingMachine vendingMachine) throws  Exception{
        return;
    };

    @Override
    public  void insertCoin(VendingMachine vendingMachine, Coin coin) throws  Exception{
        throw  new Exception("You can not insert coin in selection state");
    }

    @Override
    public  void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws  Exception{
        //1. get item of this codeNumber
        Item item = vendingMachine.getInventory().getItem(codeNumber);

        //2. total amoutn paid by user
        int paidByUser = 0;
        for(Coin coin : vendingMachine.getCoinList()){
            paidByUser+= coin.value;
        }

        // 3. compare product price and amout paid by user

        if(paidByUser < item.getPrice()){
            System.out.println("Insufficient Amount, Product you select is for price "+ item.getPrice() + " And you paid: "  + paidByUser);
            refundFullMoney(vendingMachine);
            throw  new Exception("insufficien money");
        }
        else if(paidByUser >= item.getPrice()){
            if(paidByUser > item.getPrice()){
                getChange(paidByUser - item.getPrice());
            }
            vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, codeNumber));
        }

    }
    @Override
    public int getChange(int returnExtraMoney) throws  Exception{
        System.out.println("Returned the change in coid Dispense Tray"+ returnExtraMoney);
        return returnExtraMoney;
    }
    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws  Exception{
        throw  new Exception("You can not get product in selection state");
    }
    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws  Exception{
        vendingMachine.setVendingMachineState(new IdleState());
        throw  new Exception("Returned the full amount back in the coin dispense tray");
    }

    @Override
    public  void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws  Exception{
       throw  new Exception("you can not update the vending machine in selection state");
    }
}
