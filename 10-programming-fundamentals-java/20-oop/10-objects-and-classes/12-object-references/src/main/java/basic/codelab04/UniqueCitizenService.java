package basic.codelab04;

/**
 * The goal of this codelab is the gain some insight on Object equality (equals method)
 * Therefore, don't yet execute the main method!
 * First, do the following:
 *      1. Determine which statements will result to true and which to false
 *      2. Only then execute the code and validate whether your answers were correct
 *          - To execute the code, turn the code on line 14 into a comment (or simply remove it)
 */
public class UniqueCitizenService {

    public static void main(String[] args) {
        //thinkBeforeYouRunThisExercise();

        Citizen citizenA = new Citizen("XZ-123-587", "Jimmy", "Jimmens");
        Citizen citizenB = new Citizen("XZ-123-587", "Jimmy", "Jimmens");
        Citizen citizenC = new Citizen("XZ-555-563", "Jimmy", "Jimmens");
        Citizen citizenD = new Citizen("XZ-555-563", "Franky", "Frankens");

        boolean isEqualAB = citizenA.equals(citizenB);
        boolean isEqualBC = citizenB.equals(citizenC);
        boolean isEqualCD = citizenC.equals(citizenD);

        System.out.println(isEqualAB); // will the output be true or false? Why?
        System.out.println(isEqualBC); // will the output be true or false? Why?
        System.out.println(isEqualCD); // will the output be true or false? Why?
    }

    private static void thinkBeforeYouRunThisExercise() {
        throw new RuntimeException("Not so fast. Why don't you think about it first? Then remove the call to this method.");
    }
}
