package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer{
    String battery;
    public Laptop(String processor, String ram, String graphicsCard, String company, String model, String battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' + battery;
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("I5", "8GB", "RTX3060", "LENOVO", "IDEAPAD", "16000mAh");
        System.out.println(laptop1);
        System.out.println(laptop1.getGraphicsCard());
        laptop1.setRam("32GB");
        System.out.println(laptop1);
    }
}
