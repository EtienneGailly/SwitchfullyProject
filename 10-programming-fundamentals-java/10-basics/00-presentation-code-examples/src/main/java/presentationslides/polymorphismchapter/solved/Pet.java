package presentationslides.polymorphismchapter.solved;

public class Pet {

    private final String name;
    private final int ageInYears;

    public Pet(String name, int ageInYears) {
        this.name = name;
        this.ageInYears = ageInYears;
    }

    public String getName() {
        return name;
    }

    public int getAgeInYears() {
        return ageInYears;
    }
}
