package com.marchello.labs.AutoBase;

public class Passage {
    private String source;
    private String destination;

    public Passage(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }
    public String toString() {
        return "Маршрут: " + "От \"" + source + "\" до \"" + destination + "\", ";
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passage passage = (Passage) o;
        if (!destination.equals(passage.destination)) return false;
        if (!source.equals(passage.source)) return false;
        return true;
    }
    public int hashCode() {
        int result = source.hashCode();
        result = 31 * result + destination.hashCode();
        return result;
    }
}
