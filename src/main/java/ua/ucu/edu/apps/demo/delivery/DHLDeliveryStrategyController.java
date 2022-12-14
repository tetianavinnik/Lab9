package ua.ucu.edu.apps.demo.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.ucu.edu.apps.demo.flower.Flower;
import ua.ucu.edu.apps.demo.flower.FlowerBucket;
import ua.ucu.edu.apps.demo.flower.FlowerPack;
import ua.ucu.edu.apps.demo.order.Order;
import ua.ucu.edu.apps.demo.payment.CreditCardPaymentStrategy;
import ua.ucu.edu.apps.demo.payment.Payment;

@RequestMapping(path = "/api/v1/DHLdelivery") @RestController
public class DHLDeliveryStrategyController {
    @GetMapping
    public String getDelivery() {
        Flower item = new Flower(1, 12.5, "red", 12);
        FlowerBucket flowerBucket = new FlowerBucket();
        FlowerPack flowerPack = new FlowerPack(item, 12);
        flowerBucket.add(flowerPack);
        flowerBucket.add(flowerPack);
        Payment payment = new CreditCardPaymentStrategy("James", "");
        Delivery delivery = new PostDeliveryStrategy();
        Order order = new Order(payment, delivery);
        order.addItem(flowerBucket);
        order.addItem(flowerBucket);
        DHLDeliveryStrategy dhlDeliveryStrategy = new DHLDeliveryStrategy();
        return dhlDeliveryStrategy.deliver(order.getItems());
    }
}
