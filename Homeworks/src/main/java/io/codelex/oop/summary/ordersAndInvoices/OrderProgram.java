package io.codelex.oop.summary.ordersAndInvoices;

public class OrderProgram {
    public static void main(String[] args) {

        FoodItem food = new FoodItem("Food", 0.99, "15.06.2023");
        ElectronicsItem pc = new ElectronicsItem("PC", 35.99, 1200);
        HouseholdItem cart = new HouseholdItem("Cart", 25.99, "SpaceGray");

        Order order = new Order();
        order.addItem(food);
        order.addItem(pc);
        order.addItem(cart);

        Invoice invoice = new Invoice(order, "SOMENUM135");

        System.out.println(invoice.generateInvoiceText());

        invoice.send();

        System.out.println("Invoice status after sending: " + invoice.getStatus());
    }
}
