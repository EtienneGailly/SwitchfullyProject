import com.github.javafaker.Faker;

public class Main {
  public static void main(String[] args) {
    printRandomInfo();
    printRandomInfo();


  }

  private static void printRandomInfo() {
    Faker faker = new Faker();

    String name = faker.name().fullName(); // Miss Samanta Schmidt
    String firstName = faker.name().firstName(); // Emory
    String lastName = faker.name().lastName(); // Barton

    String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
    System.out.println(name);
    System.out.println(firstName);
    System.out.println(lastName);
    System.out.println(streetAddress);
    System.out.println("***********************");
  }
}
