package presentationslides.objectschapter.cat01;

public class CatApplication {

    public static void main(String[] args) {
        Cat garfield = new Cat("Pissed", true, 9, 30, "Orange");
        String producedSound = garfield.meow();
        System.out.println("This is what garfield sounds like: " + producedSound);

    }

}
