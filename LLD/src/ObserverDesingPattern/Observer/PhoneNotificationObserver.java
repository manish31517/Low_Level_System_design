package ObserverDesingPattern.Observer;

import ObserverDesingPattern.Observable.StockObservable;

public class PhoneNotificationObserver implements NotificationAlertObserver{
    private String username;
    private StockObservable stock;

    public PhoneNotificationObserver(String username, StockObservable stock){
         this.username= username;
         this.stock = stock;
    }

    public void update(){
        this.sendMessage(username,"stock is available!! hurry up");
    }

    private  void sendMessage(String  username, String message)
    {
        System.out.println("Message sent to user"+username);
    }


}
