package ObserverDesingPattern.Observable;

import ObserverDesingPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableimpl implements StockObservable{
   private List<NotificationAlertObserver> observerList = new ArrayList<NotificationAlertObserver>();
   private int stocks;

   public  IphoneObservableimpl(){
      stocks = -1;
   }
   @Override
   public void add(NotificationAlertObserver observer){
      observerList.add(observer);
   }

   @Override
   public void remove(NotificationAlertObserver observer){
      observerList.remove(observer);
   }
   @Override
   public  void notifySubscriber(){
      for(NotificationAlertObserver observer : observerList){
         observer.update();
      }
   }
   @Override
   public void  setStockCount(int stockCount){
      if(stockCount==0){
         notifySubscriber();
      }
      stocks = stockCount;
   }

   @Override
   public int getStockCount(){
      return stocks;
   }
}
