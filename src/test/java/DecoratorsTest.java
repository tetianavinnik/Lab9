import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.ucu.edu.apps.demo.flower.Flower;
import ua.ucu.edu.apps.demo.order.BasketDecorator;
import ua.ucu.edu.apps.demo.order.Item;
import ua.ucu.edu.apps.demo.order.PaperDecorator;
import ua.ucu.edu.apps.demo.order.RibbonDecorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorsTest {
    private Item item;

    @BeforeEach
    public void init() {
        item = new Flower(1, 12.5, "red", 10);
    }

    @Test
    public void testDecorators() {
        assertEquals(10, item.getPrice());
        item = new PaperDecorator(item);
        assertEquals(23, item.getPrice());
        item = new BasketDecorator(item);
        assertEquals(27, item.getPrice());
        item = new RibbonDecorator(item);
        assertEquals(67, item.getPrice());
    }
}
