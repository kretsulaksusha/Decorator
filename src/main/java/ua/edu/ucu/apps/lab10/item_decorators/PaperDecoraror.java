package ua.edu.ucu.apps.lab10.item_decorators;

import lombok.Getter;

@Getter
public class PaperDecoraror extends ItemDecorator {
    public PaperDecoraror(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return "Paper decoration.";
    }
    
    @Override
    public double getPrice() {
        return 13 + super.getPrice();
    }

}
