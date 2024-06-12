package basic.codelab03;

/**
 * Do the following
 * ------------------
 * 1. Create a main method.
 *      TIP: in the body of DogEqualityApp, simply type psvm and press tab.
 *      IntelliJ will generate the main method for you (psvm -> Public Static Void Main)
 * 2. In the body of the main method, create 2 Dog objects with the same name and birthYear
 *      - Check for equality using the == operator. Do you expect the result to be true or false?
 *      - Check for equality using the equals method. Do you expect the result to be true or false?
 */
public class DogEqualityApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Jerry",(short)2017);
        Dog dog2 = new Dog("Jerry",(short)2017);
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

    }
}
