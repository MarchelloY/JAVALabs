package com.marchello.labs.Lab10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MySet {
    private List<Integer> elements;

    public MySet(Integer... elements) {
        this(Arrays.asList(elements));
    }
    private MySet(List<Integer> elements) {
        this.elements = elements;
    }
    public MySet intersect(MySet other) {
        return new MySet(this.elements.stream()
                .filter(other.elements::contains)
                .collect(Collectors.toList()));
    }
    public MySet unify(MySet other) {
        return new MySet(Stream.concat(this.elements.stream(), other.elements.stream())
                .distinct()
                .collect(Collectors.toList()));
    }
    @Override
    public String toString() {
        return elements.toString();
    }
}
