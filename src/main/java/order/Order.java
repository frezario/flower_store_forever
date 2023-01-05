package order;

import logic.Flower;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Flower> items;
    private Payment payment;
    private Delivery delivery;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double sum = 0;
        for (Flower item: items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void processOrder() {
        // Some primitive order processing
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }

    public void addItem(Flower item) {
        items.add(item);
    }

    public void removeItem(Flower item) {
        int index = items.indexOf(item);
        if (index != -1) {
            items.remove(item);
        }
    }
}
