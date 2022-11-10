package ua.ucu.edu.apps.demo.order;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 40 + this.getItem().getPrice();
    }
}
