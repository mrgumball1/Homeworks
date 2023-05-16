package io.codelex.classesandobjects.practice.Exercise1;

public class TestProduct {
    public static void main(String[] args) {
        Product product1 = new Product("Logitech mouse", 70.00, 14);
        Product product2 = new Product("iPhone 5s", 999.99, 3);
        Product product3 = new Product("Epson EB-U05", 440.46, 1);
        System.out.println(product1.printProduct());
        System.out.println(product2.printProduct());
        System.out.println(product3.printProduct());
        product1.setName("Logitech headset");
        product1.setAmountAtStart(20);
        product1.setPriceAtStart(120.00);
        System.out.println(product1.printProduct());

    }
}
