package basic.solutions.codelab05;

import java.util.Objects;
import java.util.UUID;

public class Author {

    private UUID uniqueReference;
    private String lastname;
    private String firstname;

    public Author(String lastname, String firstname) {
        this.uniqueReference = UUID.randomUUID();
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    String getUniqueReference() {
        return uniqueReference.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(uniqueReference, author.uniqueReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueReference);
    }
}
