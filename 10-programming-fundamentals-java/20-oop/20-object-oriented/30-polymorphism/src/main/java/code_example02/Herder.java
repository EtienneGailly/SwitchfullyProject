package code_example02;

public class Herder {

    private Sheep[] sheeps;

    public Herder(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public void letSheepsEat(){
        for(Sheep sheep: sheeps) {
            sheep.eat();
        }
    }
}
