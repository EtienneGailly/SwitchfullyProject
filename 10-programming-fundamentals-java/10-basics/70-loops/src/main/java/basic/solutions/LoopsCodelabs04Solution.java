package basic.solutions;

public class LoopsCodelabs04Solution {

    /**
     * Create a method that will print out all the values of given String array with their respective index.
     * At the end thank the user for using your method.
     * If the array is empty, print out "Nothing to print".
     * E.g. printOutArray({"a","b","c","d"} will print out
     * At index 0 there is: a
     * At index 1 there is: b
     * At index 2 there is: c
     * At index 3 there is: d
     * Thank you for using the print services
     */
    public static void printOutArray(String[] array) {
        if(array.length == 0){
            System.out.println("Nothing to print");
            return;
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println("At index " + index + " there is: " + array[index]);
        }
        System.out.println("Thank you for using the print services");
    }
}
