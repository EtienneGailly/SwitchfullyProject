package code_example04;

public class Dog implements PetType {

    public Dog() {
    }

    @Override
    public String feed() {
        return "I am a Dog, I like meat";
    }
}
