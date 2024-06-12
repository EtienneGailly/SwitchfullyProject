package basic.solutions;

public class MethodsCodelab12Solution {

    public static void main(String[] args) {

        // ------------
        // This code could use some more methods
        // Use the principles of SRP and Duplication to find a good set of methods
        // Hint: Try to describe in your own words what this code does
        // - this code is used to ... (the final result of the code). Use this wording to find good method names.
        // - look for and remove duplication

        printOutPerson("Jef", 1988);
        printOutPerson("Sofie", 2005);
    }

    private static void printOutPerson(String name, int birthYear) {
        System.out.println("***********************");
        printName(name);
        printAge(calculateAge(birthYear));
        System.out.println("Which means I am");
        printMajority(birthYear);
    }

    private static void printName(String name){
        System.out.println("Hi my name is " + name);
    }

    private static void printAge(int age){
        System.out.println("I am " + age + " years old.");
    }

    private static void printMajority(int birthYear){
        if (isAdult(birthYear)) {
            System.out.println("an adult");
        } else {
            System.out.println("not an adult");
        }
    }

    private static int calculateAge(int birthYear) {
        return 2021 - birthYear;
    }

    private static boolean isAdult(int birthYear) {
        return calculateAge(birthYear) > 18;
    }
}
