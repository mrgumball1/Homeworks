package io.codelex.oop.summary.ordersAndInvoices;

import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) {

        FoodItem food = new FoodItem("Food", 0.99, LocalDate.of(2023,6,23));
        ElectronicsItem pc = new ElectronicsItem("PC", 35.99, 1200);
        HouseholdItem cart = new HouseholdItem("Cart", 25.99, "SpaceGray");
        FoodItem expireFood = new FoodItem("Rotten", 0.05, LocalDate.of(2023, 6, 14));
        ItemPacking packing = new ItemPacking();
        try {

            Order order = new Order();
            order.addItem(food);
            order.addItem(pc);
            order.addItem(cart);
            order.addItem(expireFood);
            order.addItem(packing);

        Invoice invoice = new Invoice(order, "SOMENUM135");

        System.out.println(invoice.generateInvoiceText());

        invoice.send();

        System.out.println("Invoice status after sending: " + invoice.getStatus());
        }catch (WrongOrderException | BadFoodException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
