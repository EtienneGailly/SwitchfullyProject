package code_example04;

public class Pet {

    private String name;
    private PetType petType;

    public Pet(String name, PetType petType) {
        this.name = name;
        this.petType = petType;
    }

    public String feed() {
        return petType.feed();
    }
}
