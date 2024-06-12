package basic.solutions.codelab01.animal;

public class AnimalRepository {

    private final Animal[] animals = new Animal[] {
            new Animal("Cat", "Felix"),
            new Animal("Dog", "Blacky"),
            new Animal("Dog", "Snowy"),
            new Animal("Cat", "SnuzzleFuzzle"),
    };

    public Animal getAnimalByName(String name) {
        for(Animal animal: animals) {
            if(animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }
}
