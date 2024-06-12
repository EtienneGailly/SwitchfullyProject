package presentationslides.polymorphismchapter.upcast;

public class Car extends Vehicle {

    public String visitCarwash() {
        return "Getting washed";
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();
        v.honk();
        Car myCar = (Car) v;
        myCar.visitCarwash();
    }

}
