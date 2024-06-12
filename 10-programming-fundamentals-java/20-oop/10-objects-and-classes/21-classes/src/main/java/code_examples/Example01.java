package code_examples;

public class Example01 {

    public static void main(String[] args) {
        String name1 = "Sarah";
        String street1 = "Rue de l'église";
        String number1 = "34";
        String city1 = "Namur";
        String zipCode1 = "5000";
        sendLetter(name1, street1, number1, city1, zipCode1);

        String name2 = "Jef";
        String street2 = "Naamsestraat";
        String number2 = "234";
        String city2 = "Leuven";
        String zipCode2 = "3000";
        sendLetter(name2, street2, number2, city2, zipCode2);
    }

    private static void sendLetter(String name, String street, String number, String city, String zipCode) {
        System.out.println("Sending letter to " + name);
        System.out.println(street + " " + number);
        System.out.println(city + " " + zipCode);
    }
}
