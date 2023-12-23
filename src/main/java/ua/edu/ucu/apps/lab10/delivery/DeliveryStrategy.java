package ua.edu.ucu.apps.lab10.delivery;

import ua.edu.ucu.apps.lab10.flowers.Order;

public interface DeliveryStrategy {
    String deliver(Order items);
}
