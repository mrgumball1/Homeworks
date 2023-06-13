package io.codelex.oop.computers;

public class TestComputer {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("I5", "8GB", "RTX3060", "LENOVO", "IDEAPAD", "16000mAh");
        System.out.println(laptop1);
        System.out.println(laptop1.getGraphicsCard());
        laptop1.setRam("32GB");
        System.out.println(laptop1);

        Computer pc1 = new Computer("I9", "16GB", "RTX3070", "ALIENWARE", "SUPEDDUPERMODEL-X");
        System.out.println(pc1);
        pc1.setModel("JUST MODEL");
        System.out.println(pc1);
    }
}
