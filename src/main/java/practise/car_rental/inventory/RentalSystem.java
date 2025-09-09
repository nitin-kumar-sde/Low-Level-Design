package practise.car_rental.inventory;

import java.util.*;

// this can be single ton
public class RentalSystem {

    private final String name;
    private final List<RentalStore> stores;

    public RentalSystem(String name) {
        this.name = name;
        this.stores = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void registerStore(RentalStore store) {
        stores.add(store);
        System.out.println("✅ Registered store: " + store);
    }

    public List<RentalStore> getAllStores() {
        return Collections.unmodifiableList(stores);
    }


    // we will overload this function List<Filters> to support search
    // with multiple filters
    public RentalStore findStoreById(UUID storeId) {
        return stores.stream()
                .filter(s -> s.getId().equals(storeId))
                .findFirst()
                .orElse(null);
    }
}
