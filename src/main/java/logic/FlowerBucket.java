package logic;

import java.util.ArrayList;
import java.util.Objects;

public class FlowerBucket {
    private final ArrayList<Flower> items;

    public FlowerBucket() {
        this.items = new ArrayList<Flower>();
    }

    public void addFlowers(Flower item) {
        items.add(item);
    }

    public int searchFlower(Flower flower) {
        int idx = 0;
        for (Flower item: items) {
            if (Objects.equals(flower.getColor(), item.getColor()) &&
                    flower.getSepalLength() == item.getSepalLength()) {
                return idx;
            }
            idx++;
        }
        return idx;
    }

    public double price() {
        double sum = 0;
        for (Flower pack: items) {
            sum += pack.getPrice();
        }
        return sum;
    }
}
