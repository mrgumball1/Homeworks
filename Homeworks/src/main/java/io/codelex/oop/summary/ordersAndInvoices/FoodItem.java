package io.codelex.oop.summary.ordersAndInvoices;

import java.time.LocalDate;

public class FoodItem extends AbstractItem {
    private final LocalDate bestBefore;

    public FoodItem(String name, double price, LocalDate bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public String getFullInfo() {
        return String.format("%s, %.2f EUR, best before: %s", name, price, bestBefore);
    }

}
