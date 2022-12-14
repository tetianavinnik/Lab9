package ua.ucu.edu.apps.demo.order;

import lombok.Getter;
import lombok.Setter;
import ua.ucu.edu.apps.demo.delivery.Delivery;
import ua.ucu.edu.apps.demo.payment.Payment;
import ua.ucu.edu.apps.demo.users.AppUser;

import java.util.LinkedList;
import java.util.List;

@Setter@Getter
public class Order {
    private LinkedList<Item> items = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;
    private List<AppUser> users;

    public Order(Payment payment, Delivery delivery) {
        this.payment = payment;
        this.delivery = delivery;
    }

    public void setPaymentStrategy(Payment strategy) {
        this.payment = strategy;
    }

    public void setDeliveryStrategy(Delivery strategy) {
        this.delivery = strategy;
    }

    public double calculateTotalPrice() {
        int total = 0;
        for (int i = 0; i < this.items.size(); i++) {
            total += this.items.get(i).getPrice();
        }
        return total;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void processOrder() {
        if (payment.pay(calculateTotalPrice())) {
            delivery.deliver(items);
        }
    }

    public void addUser(AppUser appUser) {
        users.add(appUser);
    }

    public void removeUser(AppUser appUser) {
        if (users.contains(appUser)) {
            users.remove(appUser);
        }
    }

    public void notifyUsers() {
        for (AppUser appUser:users) {
            appUser.update("received");
        }
    }
}
