package StateDesingPattern;

import StateDesingPattern.VendingState.State;

public class Main {
    public static void main(String[] args){

        VendingMachine vendingMachine = new VendingMachine();
        try{
            System.out.println("******************************");
            System.out.println("Filling up the inventory");
            System.out.println("******************************");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("******************************");
            System.out.println("Clicking on Insert Button");
            System.out.println("******************************");

            State vendingState = vendingMachine.getVendingMachineState();
            vendingState.clickOnInsertCoinButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.insertCoin(vendingMachine,Coin.NICKLE);
            vendingState.insertCoin(vendingMachine,Coin.QUATER);

            System.out.println("******************************");
            System.out.println("Clicking on the product selection button");
            System.out.println("******************************");

            vendingState.clickOnStartProductiSelectionButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();

            vendingState.chooseProduct(vendingMachine,102);

            displayInventory(vendingMachine);

        }catch (Exception e){
            System.out.print(e.getMessage());
            displayInventory(vendingMachine);
        }

    }

   public static void fillUpInventory(VendingMachine vendingMachine){
        ItemShelf [] inventory = vendingMachine.getInventory().getInventory();
        for(int i = 0; i < inventory.length; i++){
            Item item = new Item();
            if(i >= 0 && i < 3){
                item.setItemType(ItemType.COKE);
                item.setPrice(12);
            }
            else if(i >= 3 && i < 5){
                item.setItemType(ItemType.JUICE);
                item.setPrice(9);
            }
            else if( i >= 5 && i < 7){
                item.setItemType(ItemType.PEPSI);
                item.setPrice(13);
            }
            else if( i >= 7 && i < 10){
                item.setItemType(ItemType.SODA);
                item.setPrice(7);
            }
            inventory[i].setItem(item);
            inventory[i].setSoldOut(false);
        }
    }

    public  static  void displayInventory(VendingMachine vendingMachine){
        ItemShelf [] inventry = vendingMachine.getInventory().getInventory();
        for( ItemShelf inventory : inventry){
            System.out.println(inventory.toString());;
        }
    }
}
