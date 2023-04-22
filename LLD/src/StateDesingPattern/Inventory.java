package StateDesingPattern;

public class Inventory {
    ItemShelf [] inventory = null;

    public Inventory(int itemCount){
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory(inventory);
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public  void initialEmptyInventory(ItemShelf [] inventory){
        int startCode = 101;
        for(int i = 0; i < inventory.length; i++){
            ItemShelf space = new ItemShelf();
            space.setItemCode(startCode);
            space.setSoldOut(true);
             inventory[i] =  space;
             startCode++;
        }
    }

    public  void addItem(Item item,int codeNumber) throws Exception{
         for(int i = 0; i < inventory.length; i++){
             if(inventory[i].getItemCode() == codeNumber)
             {
                 if(inventory[i].isSoldOut() == true){
                 inventory[i].setItem(item);
                 inventory[i].setSoldOut(false);
             }
             else{
                 throw  new Exception("Already item is persent, you can not add item here");
             }
         }
         }
    }

    public  Item getItem(int codeNumber) throws  Exception{
              for(ItemShelf itemShelf: inventory){
                  if(itemShelf.getItemCode() == codeNumber){
                      if(itemShelf.isSoldOut() == false){
                       return itemShelf.getItem();
                      }
                      else{
                        throw new Exception("Item is alreayd sold out");
                      }
                  }

              }
          throw new Exception("Invalid code number");
    }

    public  void updateSoldItem(int codeNumber){
        for(ItemShelf item : inventory){
            if(item.getItemCode() == codeNumber){
                item.setSoldOut(true);
            }
        }
    }
}
