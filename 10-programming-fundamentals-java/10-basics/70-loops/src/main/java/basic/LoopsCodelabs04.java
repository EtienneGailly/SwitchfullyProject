package basic;

public class LoopsCodelabs04 {

    /**
     * Create a method that will print out all the values of given String array with their respective index.
     * At the end thank the user for using your method
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
        for (int i = 0; i < array.length; i++) {
            System.out.println("At index "+i+" there is: " + array[i]);
        }
        System.out.println("Thank you for using the print services");
    }
}
