package presentationslides.classeschapter.cat01;

public class Cat {

    private String name;
    private String mood;

    public Cat(String name, String mood) {
        this.name = name;
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public String meow() {
        if(mood.equals("Pissed")) {
            return "Raaauw!";
        } return "Purr... Miauw";
    }

}


