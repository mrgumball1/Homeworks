package io.codelex.oop.summary.ordersAndInvoices;

public class ElectronicsItem extends AbstractItem {
    private int power;

    public ElectronicsItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getFullInfo() {
        return getName() + ", " + getPrice() + " EUR, power: " + power + "W";
    }
}
