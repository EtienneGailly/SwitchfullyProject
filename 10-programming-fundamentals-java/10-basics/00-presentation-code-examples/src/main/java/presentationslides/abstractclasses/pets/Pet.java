package presentationslides.abstractclasses.pets;

public abstract class Pet {

    private int ageInYears;
    private String name;

    public Pet(int ageInYears, String name) {
        this.ageInYears = ageInYears;
        this.name = name;
    }

    public abstract String makeSound();

    public int getAgeInYears() {
        return ageInYears;
    }

    public String readNameTag() {
        return "The tag reads: " + name;
    }
}
