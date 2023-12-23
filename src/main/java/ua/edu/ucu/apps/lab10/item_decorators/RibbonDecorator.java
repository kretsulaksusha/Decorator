package ua.edu.ucu.apps.lab10.item_decorators;

import lombok.Getter;

@Getter
public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return "Ribbon decoration.";
    }
    
    @Override
    public double getPrice() {
        return 40 + super.getPrice();
    }
    
}
