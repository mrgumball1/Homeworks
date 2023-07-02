package io.codelex.oop.summary.ordersAndInvoices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<SellableThing> items;

    public Order() {
        items = new ArrayList<>();
    }

    public List<SellableThing> getItems() {
        return items;
    }

    public void addItem(SellableThing item) throws BadFoodException {
        if (item instanceof FoodItem foodItem) {

            LocalDate today = LocalDate.now();
            if (foodItem.getBestBefore().isBefore(today)) {
                throw new BadFoodException("Food are rotten");
            }
        }
        items.add(item);
    }

    public String getOrderText() {
        StringBuilder sb = new StringBuilder();
        for (SellableThing item : items) {
            sb.append(item.getFullInfo()).append("\n");
        }
        return sb.toString();
    }
}