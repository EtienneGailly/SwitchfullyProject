package basic.codelab03;

public class Person {
    private int age;
    public Person(int age) {
        this.age = age;
    }
    public int calculateAllowance() {
        int allowance = 0;
        if (age >= 0 && age <= 12) {
            allowance += 100;
        }
        if (age >= 13 && age < 18) {
            allowance += 100;
            allowance += (age-12)*5;
        }
        return allowance;
    }
}
