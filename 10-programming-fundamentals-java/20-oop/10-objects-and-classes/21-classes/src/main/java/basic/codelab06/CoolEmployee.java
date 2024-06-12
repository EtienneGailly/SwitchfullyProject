package basic.codelab06;

public class CoolEmployee {
    private final int id;
    private String firstName;
    private String lastName;
    private int salary;

    public CoolEmployee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public double getAnnualSalary() {
        return salary*13.9;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        this.salary += salary * byPercent;
    }

    @Override
    public String toString() {
        return "fistName " + "lastName";
    }
}
