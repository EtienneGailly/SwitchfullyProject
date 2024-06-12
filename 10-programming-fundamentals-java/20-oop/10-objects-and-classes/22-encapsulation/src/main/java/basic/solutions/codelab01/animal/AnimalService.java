package basic.solutions.codelab01.animal;

public class AnimalService {

    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Animal getAnimalByName(String name) {
        return animalRepository.getAnimalByName(name);
    }


}
