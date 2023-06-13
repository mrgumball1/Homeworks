package io.codelex.oop.summary.ordersAndInvoices;

public class ItemPacking implements Service {
     protected static final String NAME = "Item packing";
    protected static final double PRICE = 5.00;
    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getFullInfo() {
        return NAME + " " + String.format("%.2f", PRICE) + " EUR";
    }
}
