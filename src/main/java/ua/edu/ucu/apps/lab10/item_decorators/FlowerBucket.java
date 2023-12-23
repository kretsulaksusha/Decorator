package ua.edu.ucu.apps.lab10.item_decorators;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import ua.edu.ucu.apps.lab10.flowers.FlowerPack;

@Getter
public class FlowerBucket extends Item {
    private List<FlowerPack> flowerBucket = new ArrayList<>();


    public void add(FlowerPack flowerPack) {
        flowerBucket.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerBucket) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        return "Number of types of flowers in the flower bucket: " + getFlowerBucket().size() + ".";
    }
}
