# Car composition

A `Car` has an `Engine`, a `Driver` and `Passenger[]`. 

Create and implement these classes in such a way that the following code works:
```java
Engine engine = new Engine(20); // 20 horse-power
Driver driver = new Driver("James", 18); // name and age
Passenger[] passengers = new Passenger[]{new Passenger("Ann")};

Car myCar = new Car(engine, driver, passengers);
System.out.println(myCar);

// should print:
// I am car with 1 passenger(s) (Ann), a driver called James of 18 years old 
// and engine with 20 horse-power
``` 

You'll use the concept of composition to implement this.
