package basic.solutions.codelab01;

import basic.solutions.codelab01.animal.Animal;
import basic.solutions.codelab01.animal.AnimalRepository;
import basic.solutions.codelab01.animal.AnimalService;
import basic.solutions.codelab01.car.Car;
import basic.solutions.codelab01.car.CarRepository;
import basic.solutions.codelab01.car.CarService;
import basic.solutions.codelab01.sport.Sport;
import basic.solutions.codelab01.sport.SportRepository;
import basic.solutions.codelab01.sport.SportService;

public class Main {

    private final static AnimalService animalService = new AnimalService(new AnimalRepository());
    private final static CarService carService = new CarService(new CarRepository());
    private final static SportService sportService = new SportService(new SportRepository());

    /**
     *
     * Create packages for the classes in this code lab.
     * Put classes that are closely related together in the same package.
     *
     * A good rule to follow is to limit your packages to a max of 7 classes per package.
     *
     */
    public static void main(String[] args) {
        Animal animal = animalService.getAnimalByName("Felix");
        animal.letDayPass();
        System.out.println(animal);
        animal.feed();
        System.out.println(animal);

        Car car = carService.getCarByType("Sports Car");
        car.turnOn();
        car.pressBreak();

        Sport sport = sportService.getSportByName("Tennis");
        sport.play();
    }
}
