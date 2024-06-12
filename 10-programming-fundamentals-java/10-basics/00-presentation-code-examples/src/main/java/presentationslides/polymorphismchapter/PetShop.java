package presentationslides.polymorphismchapter;

public class PetShop {

    private Cat[] cats = {new Cat("Felix", 5)};
    private Dog[] dogs = {new Dog("Brutus", 2)};
    private Fish[] fishes = {new Fish("Nemo", 1)};

    public Cat[] showCats() {
        return cats;
    }

    public Dog[] showDogs() {
        return dogs;
    }

    public Fish[] showFish() {
        return fishes;
    }

}
