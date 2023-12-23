package ua.edu.ucu.apps.lab10.delivery;

import lombok.Getter;
import ua.edu.ucu.apps.lab10.flowers.Order;
import ua.edu.ucu.apps.lab10.item_decorators.Item;

@Getter
public class PostDeliveryStrategy implements DeliveryStrategy {
    private String description = "Post Delivery";

    @Override
    public String deliver(Order items) {
        for (Item item : items.getItems()) {
            items.remove(item);
        }
        return "Order was successfully delivered by Post Delivery!";
    }

}
