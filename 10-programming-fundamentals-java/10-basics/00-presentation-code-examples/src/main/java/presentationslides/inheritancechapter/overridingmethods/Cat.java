package presentationslides.inheritancechapter.overridingmethods;

public class Cat extends Pet{

    private Object food;

    @Override
    public String eat() {
        if(isExpensive(food)) {
            return "I am eating the food";
        } return "I am not eating cheap food";
    }

    private boolean isExpensive(Object food) {
        return true;
    }
}
