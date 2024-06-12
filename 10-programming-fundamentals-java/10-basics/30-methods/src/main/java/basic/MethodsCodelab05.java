package basic;

public class MethodsCodelab05 {

    public static void main(String[] args) {
        // Create a method get5() which returns 5 (int)
        // print the output of get5() here
        System.out.println(get5());
    }

    // Don't forget the static keyword when creating the get5() method.
    // Otherwise, you won't be able to call it from the main(...) method which is also static.

    // We haven't talked about the static keyword yet, we'll cover this topic when we start with object-oriented programming (OOP).
    // The static keyword is a modifier for methods (and attributes).
    // Static methods/attributes can be accessed without creating an object of a class, therefor it is shared between all objects of that class.
    // Don't worry if you don't understand this yet:

    public static int get5() {return 5;}
}
