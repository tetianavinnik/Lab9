package ua.ucu.edu.apps.demo.order;

public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 4 + this.getItem().getPrice();
    }
}