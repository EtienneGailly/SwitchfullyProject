package basic.solutions;

public class LoopsCodelabs03Solution {


    /*
     * This code will wish someone a happy birthday by saying "Hip Hip Hooray" for every year they are old.
     *
     * Remove the duplication in this code using loops and methods.
     */
    public static void main(String[] args) {
        happyBirthday("Sophie", 10);
        happyBirthday("Jef", 7);
    }

    private static void happyBirthday(String name, int yearsOld) {
        System.out.println("Happy Birthday " + name + "!");
        System.out.println("You're today " + yearsOld + " years old!");
        for (int i = 0; i < yearsOld; i++) {
            System.out.println("Hip Hip Hooray!");
        }
    }
}
