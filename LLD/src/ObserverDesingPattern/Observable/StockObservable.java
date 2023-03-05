package ObserverDesingPattern.Observable;

import ObserverDesingPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscriber();
    public  void setStockCount(int stock);
    public int getStockCount();
}
