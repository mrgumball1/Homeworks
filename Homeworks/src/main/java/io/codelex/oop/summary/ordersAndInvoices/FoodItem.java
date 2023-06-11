package io.codelex.oop.summary.ordersAndInvoices;

public class FoodItem extends AbstractItem {
    private String bestBefore;

    public FoodItem(String name, double price, String bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public String getBestBefore() {
        return bestBefore;
    }

    public String getFullInfo() {
        return String.format("%s, %.2f EUR, best before: %s", name, price, bestBefore);
    }

}
