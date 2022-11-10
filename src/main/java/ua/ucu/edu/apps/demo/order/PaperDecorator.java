package ua.ucu.edu.apps.demo.order;

public class PaperDecorator extends ItemDecorator{
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 13 + this.getItem().getPrice();
    }
}
