package basic.solutions.codelab03;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int calculateAllowance() {
        if (age < 0) {
            return 0;
        }
        if (age <= 12) {
            return 100;
        }
        if (age < 18) {
            return 100 + (age - 12) * 5;
        }
        return 0;
    }
}
