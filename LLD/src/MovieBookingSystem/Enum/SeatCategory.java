package MovieBookingSystem.Enum;

public enum SeatCategory {
    SILVER(20),
    GOLD(250),
    PLATINUM(400);

    int price;
    SeatCategory(int price){
        this.price = price;
    }

    public  double getPrice(){
        return price;
    }
}
