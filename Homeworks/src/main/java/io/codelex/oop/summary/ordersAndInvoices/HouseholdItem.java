package io.codelex.oop.summary.ordersAndInvoices;

public class HouseholdItem extends AbstractItem {
    private String color;

    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getFullInfo() {
        return getName() + ", " + getPrice() + " EUR, color: " + color;
    }
}
