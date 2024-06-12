package basic.solutions.codelab01.car;

public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car getCarByType(String type) {
        return carRepository.getCarByType(type);
    }
}
