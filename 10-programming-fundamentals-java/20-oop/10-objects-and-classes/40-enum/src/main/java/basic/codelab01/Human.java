package basic.codelab01;

public class Human {
    private String firstname;
    private String lastname;
    private Gender gender;

    public Human(String firstname, String lastname, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
    }

    public static void main(String[] args) {
        Human boy = new Human("Jean", "Guy", Gender.MALE);
        Human girl = new Human("Julie", "Lol", Gender.FEMALE);
        Human other = new Human("Dominique", "Nique", Gender.OTHER);

        System.out.println(boy);
        System.out.println(girl);
        System.out.println(other);
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                '}';
    }
}
