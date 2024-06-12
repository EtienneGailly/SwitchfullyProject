package basic.solutions.codelab05;

import java.awt.*;

public class CatRunner {

    private static Cat garfield;

    /**
     *  Do the following
     *  ------------------
     * Create a Cat object
     * Create a Cat object with name = Garfield, age = 27 and color = Orange
     * Create a Cat object with name = Felix, age = 10 and color = Black
     * Create a Cat object with name = Dobby, age = 3 and color = Red
     *
     * Then:
     *    Print out all 4 cats
     *    Let garfield fight felix
     *    Let Dobby miauw
     *    Print out garfield's color
     *    Print out garfield's name
     *    Print out garfield's age
     *
     * What is outputted should look exactly like this (there is a test for this):
     *    I am a cat named Generic cat, have color java.awt.Color[r=0,g=0,b=0] and I'm 99 years old.
     *    I am a cat named Garfield, have color java.awt.Color[r=255,g=200,b=0] and I'm 27 years old.
     *    I am a cat named Felix, have color java.awt.Color[r=0,g=0,b=0] and I'm 10 years old.
     *    I am a cat named Dobby, have color java.awt.Color[r=255,g=0,b=0] and I'm 3 years old.
     *    The following cat has won the fight: I am a cat named Felix, have color java.awt.Color[r=0,g=0,b=0] and I'm 10 years old.
     *    Dobby says MIAUW!
     *    java.awt.Color[r=255,g=200,b=0]
     *    Garfield
     *    27
     *
     */
    public static void main(String[] args) {

        // Start creating cats here!
        Cat cat = new Cat();
        Cat garfield = new Cat("Garfield", 27, Color.ORANGE);
        Cat felix = new Cat("Felix", 10, Color.BLACK);
        Cat dobby = new Cat("Dobby", 3, Color.RED);

        System.out.println(cat);
        System.out.println(garfield);
        System.out.println(felix);
        System.out.println(dobby);
        System.out.println(Cat.fight(garfield, felix));
        dobby.miauw();
        System.out.println(garfield.getColor());
        System.out.println(garfield.getName());
        System.out.println(garfield.getAgeInYears());
    }

}
