package basic.solutions.codelab03;

public class AccountOwner {
  private final String firstName;
  private final String lastName;

  public AccountOwner(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  @Override
  public String toString() {
    return "Mr. or Mrs. " + this.lastName + ", " + this.firstName;
  }
}
