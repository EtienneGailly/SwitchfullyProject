package basic.solutions.codelab01;

public class Human {
    private String firstname;
    private String lastname;
    private Gender gender;

    public Human(String firstname, String lastname, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " has gender " + gender;
    }
}
