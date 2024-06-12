package basic.solutions;

import java.util.stream.IntStream;

public class LoopsCodelabs01Solution {

    public static void main(String[] args) {
        repeatWithWhile();
        repeatWithFor();
        repeatWithStream();
        loopHard();
    }

    /**
     * Loops are created to make it very easy to repeat something multiple times.
     * Checkout this while-loop.
     * - What will it do?
     * - Can you change the while loop so that it prints out 'Hello!' one more time?
     * <p>
     * While-loops are the most primitive way you can write a loop.
     * However they are used very rarely in modern programming, because in general they are harder to read.
     */
    private static void repeatWithWhile() {
        int i = 0;
        while (i < 6) {
            System.out.println("Hello!");
            i++;
        }
        System.out.println("Finished");
    }

    /**
     * Since most while-loops followed the same pattern having:
     * - a starting point (e.g. int i = 0)
     * - a condition (i < 5)
     * - an action to make sure the loop will eventually end (i++)
     * programmers created a syntax that forces you to put these 3 elements together.
     * Introducing the for-loop!
     * <p>
     * Checkout the following code.
     * There is something wrong with the for-loop.
     * - Can you fix it?
     * - Can you change the for-loop so that it prints out 'hello' one more time?
     */
    private static void repeatWithFor() {
        for(int i=0; i < 5; i++) {
            System.out.println("Hello!");
        }
        System.out.println("Finished");
    }

    /**
     * Streams are the most modern approach to working with loops.
     * They are the most expressive and typically the easiest to understand.
     * (However sometimes a for-loop is still easier to understand)
     * <p>
     * This is just an example. You can ignore it if you like.
     * We'll be explaining streams in a later chapter.
     */
    private static void repeatWithStream() {
        IntStream.range(0, 5).forEach(a -> System.out.println("Hello!"));
        System.out.println("Finished");
    }


    /**
     * Why prefer for-loops over while loops?
     * <p>
     * Loops are hard to understand. Try to keep them simple!
     * It will make your life and that of your colleagues more enjoyable.
     * <p>
     * Tip:
     * - when using loops try to write it as follows: 'for(int i = 0; i < <number_of_times_to_repeat_the_loop>; i ++)'.
     * In 99% of the cases this will be enough to solve your problem.
     * <p>
     * Checkout the following code:
     * - Is it easy to read?
     * - Can you rewrite the code so that it prints out the same number of Hello's but it is easier to read?
     */
    private static void loopHard() {
        int index = 20;
        for(int i = 0; i < index/2; i++) {
            System.out.println("Hello!");
        }
        System.out.println("Finished");
    }
}
