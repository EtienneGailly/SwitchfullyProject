package basic.codelab02;

import java.awt.*;

/**
 * Take a piece of paper and draw boxes (like on the slides) for all the objects
 * that are in play (memory) just before the end of the main method (line 49).
 *
 *    E.g.:
 *    --------------------
 *    |     Rectangle    |
 *    |     ----------   |
 *    |     x: 1         |    <-----   myBox
 *    |     y: 2         |
 *    |     width: 10    |
 *    |     height: 5    |
 *    --------------------
 *
 * How many Rectangle objects exist? How many Point objects?
 * What is the output of the program?
 *
 * At the end of the main method, are the p1 and p2 references equal?
 *      - So really the question is: do they point to the same object in the heap?
 *      - Yes or no? Why?
 * If you think you know the answer, write a line of code to make sure!
 *
 * At the end of the main method, are the p1 and p2 objects equal?
 *      - So really the question is: are the objects themselves equal (based on (a part of) their state)
 *      - Yes or no? Why?
 * If you think you know the answer, write a line of code to make sure!
 */
public class BoxRunner {

    private static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }

    public static void main(String[] args) {
        //thinkBeforeYouRunThisExercise();

        Rectangle box1 = new Rectangle(2, 4, 8, 10);
        Point p1 = findCenter(box1);
        System.out.println(p1);

        box1.grow(1, 1);
        Point p2 = findCenter(box1);
        System.out.println(p2);

        System.out.println(p1.equals(p2));
    }

    private static void thinkBeforeYouRunThisExercise() {
        throw new RuntimeException("Not so fast. Why don't you think about it first? Then remove the call to this method.");
    }

}
