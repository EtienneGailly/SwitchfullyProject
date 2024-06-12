package basic.solutions.codelab01;

public class Alien {
    private String firstName = "Unidentified";
    private String lastName = "Unidentified";
    private int numberOfHeads = 1;

    public Alien() {
    }

    public Alien(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Alien(String firstName, String lastName, int numberOfHeads) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfHeads = numberOfHeads;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getNumberOfHeads() {
        return numberOfHeads;
    }
}
