package StateDesingPattern;

public class ItemShelf {
    Item item;
    int itemCode;
    boolean soldOut;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    @Override
    public String toString() {
        return "{" +
                "Code Number " + itemCode+
                "item=" + item.itemType +
                ", itemCode=" + itemCode +
                ", isAvailable =" + !soldOut +
                '}';
    }
}
