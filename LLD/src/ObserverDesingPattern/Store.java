package ObserverDesingPattern;

import ObserverDesingPattern.Observable.IphoneObservableimpl;
import ObserverDesingPattern.Observable.StockObservable;
import ObserverDesingPattern.Observer.EmailNotificationObserver;
import ObserverDesingPattern.Observer.NotificationAlertObserver;
import ObserverDesingPattern.Observer.PhoneNotificationObserver;

public class Store {

    public static  void main(String [] args){
        StockObservable iphoneObservableimpl= new IphoneObservableimpl();

        NotificationAlertObserver email1 = new EmailNotificationObserver("xzy@gmail.com",iphoneObservableimpl);
        EmailNotificationObserver email2 = new EmailNotificationObserver("xyz@gmail.com",iphoneObservableimpl);
        NotificationAlertObserver phome = new PhoneNotificationObserver("xyz", iphoneObservableimpl);

        iphoneObservableimpl.add(email1);
        iphoneObservableimpl.add(phome);
        iphoneObservableimpl.add(email2);

        iphoneObservableimpl.setStockCount(0);
        iphoneObservableimpl.setStockCount(10);
    }
}
