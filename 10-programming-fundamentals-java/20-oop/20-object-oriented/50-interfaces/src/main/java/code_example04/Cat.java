package code_example04;

public class Cat implements PetType {

    public Cat() {
    }

    @Override
    public String feed() {
        return "I am cat, I like fish";
    }
}
