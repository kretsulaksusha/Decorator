package ua.edu.ucu.apps.lab10.delivery;

import lombok.Getter;
import ua.edu.ucu.apps.lab10.flowers.Order;
import ua.edu.ucu.apps.lab10.item_decorators.Item;

@Getter
public class DHLDeliveryStrategy implements DeliveryStrategy {
    private String description = "DHL";

    @Override
    public String deliver(Order items) {
        for (Item item : items.getItems()) {
            items.remove(item);
        }
        return "Order was successfully delivered by DHL!";
    }

}
