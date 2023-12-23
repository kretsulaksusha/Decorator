package ua.edu.ucu.apps.lab10.item_decorators;

import lombok.Getter;

@Getter
public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return "Basket decoration.";
    }

    @Override
    public double getPrice() {
        return 4 + super.getPrice();
    }
    
}
