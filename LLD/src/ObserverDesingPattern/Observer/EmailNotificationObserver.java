package ObserverDesingPattern.Observer;

import ObserverDesingPattern.Observable.StockObservable;

public class EmailNotificationObserver implements NotificationAlertObserver{
    private String emailid;
    private StockObservable stock;
    public  EmailNotificationObserver(String emailid,StockObservable stock){
         this.emailid = emailid;
         this.stock = stock;
     }

     public void update(){
        this.sendEmail(emailid, "product is in stock hurryup");

     }

     private void sendEmail(String emailid, String message){
        System.out.println("Message sent to this email"+message);
    }
}
