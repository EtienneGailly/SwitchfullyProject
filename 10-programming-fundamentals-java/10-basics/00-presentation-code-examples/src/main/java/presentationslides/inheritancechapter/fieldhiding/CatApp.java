package presentationslides.inheritancechapter.fieldhiding;

public class CatApp {

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.miauw());
        System.out.println(cat.getLifesLeft());
    }

}
