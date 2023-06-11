package io.codelex.oop.summary;

import java.util.function.Supplier;

public class LazyBox<T> {
    private Supplier<T> valueSupplier;
    private T value;

    public LazyBox(Supplier<T> valueSupplier) {
        this.valueSupplier = valueSupplier;
    }

    public T get() {
        if (value == null) {
            value = valueSupplier.get();
        }
        return value;
    }
}
