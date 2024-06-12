package presentationslides.abstractclasses.pets;

public class PetApp {

    public static void main(String[] args) {
        Pet myCat = new Cat(3, "Felix");
        System.out.println(myCat.readNameTag());
        System.out.println(myCat.getAgeInYears());
        System.out.println(myCat.makeSound());
    }
}
