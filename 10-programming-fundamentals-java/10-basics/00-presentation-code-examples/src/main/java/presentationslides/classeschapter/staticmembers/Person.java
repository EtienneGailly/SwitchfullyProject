package presentationslides.classeschapter.staticmembers;

public class Person {

    public static String name;

    public String greet() {
        return "Hello, my name is " + name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person.name = "hello";
        person.name = "yo";
        String.join(".", "www", "switchfully", "com");
    }


}
