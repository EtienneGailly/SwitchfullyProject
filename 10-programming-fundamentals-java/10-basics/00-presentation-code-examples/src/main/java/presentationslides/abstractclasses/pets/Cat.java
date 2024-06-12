package presentationslides.abstractclasses.pets;

public class Cat extends Pet {

    public Cat(int ageInYears, String name) {
        super(ageInYears, name);
    }

    @Override
    public String makeSound() {
        return "Miauw miauw";
    }

    @Override
    public String readNameTag() {
        return "The cat won't let me...";
    }
}
