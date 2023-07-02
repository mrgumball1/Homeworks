package io.codelex.oop.summary;

public class LazyBoxTest {
    public static void main(String[] args) {
        LazyBox<Integer> box = new LazyBox<>(LazyBoxTest::calculate);

        Integer contents = box.get();
        System.out.println("First time calling get: " + contents);

        Integer contents2 = box.get();
        System.out.println("Second time calling get: " + contents2);
    }

    public static Integer calculate() {
        System.out.println("Calculating...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 200;
    }
}
