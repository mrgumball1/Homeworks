package io.codelex.java_advanced_test.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... items) {
        List<String> list = new ArrayList<>();
        for (T i : items) {
            list.add(i.toString());
        }
        return String.join(separator, list);
    }
}
