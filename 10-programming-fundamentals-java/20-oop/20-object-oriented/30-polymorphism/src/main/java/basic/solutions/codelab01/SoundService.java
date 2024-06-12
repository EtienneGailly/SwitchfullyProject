package basic.solutions.codelab01;

import java.util.StringJoiner;

public class SoundService {

  public static void main(String[] args) {

    Soundable[] myObjects = {new Baby(), new Baby(), new Computer(), new Dog(), new Dog(), new Dog(), new Cat(), new Car()};

    System.out.println(allMakeSound(myObjects));

  }

  static String allMakeSound(Soundable[] objects) {
    StringJoiner joiner = new StringJoiner("\n");
    for (Soundable object : objects) {
      joiner.add(object.makeSound());
    }
    return joiner.toString();
  }

}
