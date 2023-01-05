package order;

import logic.Flower;

import java.util.List;

public interface Delivery {
    // Some delivery logic
    void deliver(List<Flower> items);
}
