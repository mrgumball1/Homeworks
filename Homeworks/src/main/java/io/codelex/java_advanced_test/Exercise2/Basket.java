package io.codelex.java_advanced_test.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    protected List<T> basket = new ArrayList<>();
    protected int size;

    public void addToBasket(T something) {
        if (size >= 10) {
            throw new BasketFullException("Basket FULL!");
        } else {
            basket.add(something);
            size += 1;
        }
    }
    public void removeFromBasket(T something) {
        if (size <= 0) {
            throw new BasketEmptyException("The basket is empty");
        } else {
            basket.remove(something);
            size -= 1;
        }
    }
}
