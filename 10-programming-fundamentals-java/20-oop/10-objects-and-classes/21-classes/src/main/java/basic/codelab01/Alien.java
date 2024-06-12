package basic.codelab01;

public class Alien {
    private String firstName;
    private String lastName;
    private int numberOfHeads;

    public Alien() {
        this.firstName = "Unidentified";
        this.lastName = "Unidentified";
        this.numberOfHeads = 1;
    }

    public Alien(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfHeads = 1;
    }

    public Alien(String firstName, String lastName, int numberOfHeads) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfHeads = numberOfHeads;
    }

    public String getFullName() {
        return firstName+" "+lastName;
    }

    public int getNumberOfHeads() {
        return numberOfHeads;
    }
}
