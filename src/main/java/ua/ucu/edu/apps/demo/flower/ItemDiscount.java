package ua.ucu.edu.apps.demo.flower;

import ua.ucu.edu.apps.demo.order.Item;

public class ItemDiscount extends Item {
    private Item item;
    public ItemDiscount(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() * 0.2;
    }
}
