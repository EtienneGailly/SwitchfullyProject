package basic.codelab04;

import java.util.Objects;

/**
 * You don't have to change anything in this class.
 */
public class Citizen {

    public final String socialSecurityNumber;
    public final String firstname;
    public final String lastname;

    public Citizen(String socialSecurityNumber, String firstname, String lastname) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citizen citizen = (Citizen) o;
        return Objects.equals(socialSecurityNumber, citizen.socialSecurityNumber);
    }

    /**
     * Whenever we override the equals method,
     * we should also (correctly) override the hashCode method.
     * However, simply ignore the hashCode for now
     */
    @Override
    public int hashCode() {
        return Objects.hash(socialSecurityNumber);
    }
}
