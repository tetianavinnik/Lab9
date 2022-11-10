package ua.ucu.edu.apps.demo.order;

import lombok.Getter;
import lombok.Setter;

abstract class ItemDecorator extends Item {
    @Getter@Setter
    private Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    public abstract double getPrice();
}
