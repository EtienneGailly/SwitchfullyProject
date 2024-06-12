package basic.solutions.codelab06;

/**
 * Do the following
 * ------------------
 * 1. Create a main method (we need it to run/execute CatApp)
 * 2. In the body of the main method, create 10 Cat objects
 *      - Each cat should be named (field: name) 'Cat Index' where Index ranges from 0 to 9.
 *          - Use a loop for this
*           - Store all the cat objects in an array
*       - Then, loop through the array and kill every cat with an uneven index (e.g. 'Cat 1')
 *          - You'll notice that afterwards, all uneven cats will have 8 lives left, all even cats 9.
*       - Finally, use the cat object with name 'Cat 9' and keep killing that cat until it has no more lives.
 *          - Inspect the kill method, does it tell you when a cat has run out of lives?
 *          - When 'Cat 9' runs out of lives, print a message to the console:
 *              - "Cat 9 has died... Luckily it's not a real cat." (don't hardcode value 'Cat 9')
 *
 */
public class CatApp {

  public static void main(String[] args) {
    Cat[] cats = new Cat[10];

    for (int i = 0; i < cats.length; i++){
      cats[i] = new Cat("Cat " + i);
      if (i % 2 != 0)
        cats[i].kill();
    }
    while(cats[9].kill());
    System.out.println(cats[9].getName() + " has died... Luckily it's not a real cat.");
  }
}
