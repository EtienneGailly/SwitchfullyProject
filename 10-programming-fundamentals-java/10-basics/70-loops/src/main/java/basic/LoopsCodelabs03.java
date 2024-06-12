package basic;

public class LoopsCodelabs03 {


    /*
     * This code will wish someone a happy birthday by saying "Hip Hip Hooray" for every year they are old.
     *
     * Remove the duplication in this code using loops and methods.
     */
    public static void main(String[] args) {
//        System.out.println("Happy Birthday Sophie!");
//        System.out.println("You're today 10 years old!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//
//        System.out.println("Happy Birthday Jef!");
//        System.out.println("You're today 7 years old!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
//        System.out.println("Hip Hip Hooray!");
        printHB("Sophie",10);
        printHB("Jef",7);
    }

    public static void printHB(String name,int age){
        System.out.println("Happy Birthday "+name+"!");
        System.out.println("You're today "+ age +" years old!");
        for(int i=0;i<age;i++){
            System.out.println("Hip Hip Hooray!");
        }
    }

}
