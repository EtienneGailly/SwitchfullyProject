package presentationslides;

public class SwitchStatement {

    public static void main(String[] args) {
        sayHelloDoWhile(3);
    }

    private static void switchMethod(int value) {
        switch(value) {
            case 0:
            case 1:
            case 2:
                System.out.println("Not old");
                break;
            case 3:
                System.out.println("older");
                break;
            default:
                System.out.println("old");
                break;
        }
    }

    public static void sayHelloWhile(int amount) {
        while(amount > 0) {
            System.out.println("Hello");
            amount--;
        }
    }

    public static void sayHelloDoWhile(int amount) {
        do {
            System.out.println("Hello");
            amount--;
        } while(amount > 0);
    }

    public static void sayHelloFor(int amount) {
        for(int cntr = 0; cntr < amount; cntr++) {
            System.out.println("Hello");
        }
    }

    public static void printNumbers() {
        int[] numbers = {4, 5, 2, 3};
        for (int number : numbers){
            System.out.println(number);
        }
    }




}
