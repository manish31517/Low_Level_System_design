package CarRentalSystem;

import java.util.List;
import java.util.stream.Collectors;

public class VehicleRentalSystem {
    List<Store> stores;
    List<User> users;

    public VehicleRentalSystem(List<Store> stores, List<User> users) {
        this.stores = stores;
        this.users = users;
    }

    public Store getStore(Location location){
        //Based on location we will filter out the store from storeList;
        return stores.stream().filter(store -> store.storeLocation.equals(location)).collect(Collectors.toList()).get(0);
    }
}
