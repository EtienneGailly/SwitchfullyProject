package presentationslides;

public class ControlFlow {

    public static void main(String[] args) {
        int myPreviousAge = getMyAge() - 1;
        System.out.println(myPreviousAge);
    }

    private static int getMyAge() {
        return 18;
    }

    private void sample() {
        int myAge = 20;
        if(myAge >= 18) {
            System.out.print("Hello, Adult!");
        } else {
            System.out.print("Hi, child!");
        }
    }

}
