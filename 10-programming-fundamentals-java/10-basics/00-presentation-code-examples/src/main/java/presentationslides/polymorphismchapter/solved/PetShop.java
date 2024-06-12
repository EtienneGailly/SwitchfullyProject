package presentationslides.polymorphismchapter.solved;

public class PetShop {

    private Pet[] pets = {
            new Cat("Felix", 5),
            new Dog("Brutus", 2),
            new Fish("Nemo", 1)
    };

    public Pet[] showPets() {
        return pets;
    }

}
