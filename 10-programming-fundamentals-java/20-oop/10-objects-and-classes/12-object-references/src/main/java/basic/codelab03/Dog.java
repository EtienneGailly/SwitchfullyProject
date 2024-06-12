package basic.codelab03;

import java.util.Objects;

/**
 * You don't have to change anything in this class.
 */
public class Dog {

    private final String name;
    private final short birthYear;

    public Dog(String name, short birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return birthYear == dog.birthYear &&
                Objects.equals(name, dog.name);
    }

    /**
     * Whenever we override the equals method,
     * we should also (correctly) override the hashCode method.
     * However, simply ignore the hashCode for now
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }
}
