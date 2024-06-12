package basic.solutions.codelab01.car;

public class CarRepository {

    private static Car[] cars = new Car[]{
            new Car("Sports Car", "Ferrari", "Red"),
            new Car("Truck", "Renault", "White"),
            new Car("Family Car", "Peugeot", "Green"),
    };


    public Car getCarByType(String type) {
        for(Car car: cars) {
            if(car.getType().equals(type)) {
                return car;
            }
        }
        return null;
    }
}
