package advanced;

public class LoopsCodelabs01 {

    public static void main(String[] args) {
        triangle(10);
    }

    /**
     * Prints out a triangle of height <height>
     *     e.g. triangle(2) --> *
     *                          **
     *
     *     e.g. triangle(4) --> *
     *                          **
     *                          ***
     *                          ****
     *
     *     e.g. triangle(0) --> ""
     *
     *
     * If you're stuck try to solve these two problems:
     * 1. Create a method that will print a rectangle of width 4 and height <heigh>
     *     e.g. rectangle(2) --> ****
     *                           ****
     *
     *     e.g. rectangle(4) --> ****
     *                           ****
     *                           ****
     *                           ****
     *
     * 2. Create a method that will print a line of a given length
     *      e.g. line(2)     --> **
     *
     *      e.g. line(4)     --> ****
     *
     * Now try to combine these two methods!
     */
    public static void triangle(int height) {
        for (int i = 1; i <= height; i++) {
            printStarLine(i);
        }
    }

    public static void printStarLine(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
