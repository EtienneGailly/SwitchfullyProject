package presentationslides.classeschapter.cat01;

public class CatApplication {

    public static void main(String[] args) {
        Cat garfield = new Cat("Garfield","Pissed");
        String producedSound = garfield.meow();
        System.out.println("This is what garfield sounds like: " + producedSound);

    }

}
