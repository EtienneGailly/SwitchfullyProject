package presentationslides.objectschapter.cat03;

import java.util.Objects;

public class Cat {

    private String name;

    public Cat(String name) { this.name = name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    // For now, you can ignore the hashCode method
    // Whenever we override the equals method, we should
    // also override the hashCode method.
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
