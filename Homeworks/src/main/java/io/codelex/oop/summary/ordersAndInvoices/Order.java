package io.codelex.oop.summary.ordersAndInvoices;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;

    public Order() {
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String getOrderText() {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append(item.getFullInfo()).append("\n");
        }
        return sb.toString();
    }
}