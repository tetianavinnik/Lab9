package ua.ucu.edu.apps.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.ucu.edu.apps.demo.order.Item;

@Setter@Getter@AllArgsConstructor
public class FlowerPack {
    private Item flower;
    private int amount;

    public double getPrice() {
        return flower.getPrice()*amount;
    }
}
