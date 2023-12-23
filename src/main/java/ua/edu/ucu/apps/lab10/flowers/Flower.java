package ua.edu.ucu.apps.lab10.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.lab10.item_decorators.Item;

// For DB we need to convert class flower to table using @Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Entity
public class Flower extends Item {
    @Id
    private Integer id;
    private FlowerType flowerType;
    private FlowerColor color;
    private double sepalLength;
    private double price;

    // copy constructor
    public Flower(Flower flower) {
        this.price = flower.price;
        this.color = flower.color;
        this.sepalLength = flower.sepalLength;
        this.flowerType = flower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    @Override
    public String getDescription() {
        return "Type: " + getFlowerType().toString() +
        "\nColor: " + getColor() +
        "\nSepal length: " + getSepalLength() +
        "\nPrice: " + getPrice();
    }
}
