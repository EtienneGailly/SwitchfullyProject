package basic.codelab01;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        Name name1 = new Name("Jean", "Guy");
        Name name2 = new Name("Diane", "Dupont");
        Name name3 = new Name("Paul", "Lhoir");
        pb.addNumberToName(name1, new PhoneNumber("0032", "499124578"));
        pb.addNumberToName(name2, new PhoneNumber("0034", "486471854"));
        pb.addNumberToName(name3, new PhoneNumber("0036", "474518495"));
        pb.printAllNamesAndNumbers();
        System.out.println("-----------------------------------");
        System.out.println(pb.getNumberFromName(name3));
        System.out.println("-----------------------------------");
        pb.removeNumberFromName(name2);
        pb.printAllNamesAndNumbers();
        System.out.println("-----------------------------------");
        pb.updateNumberFromName(name2, new PhoneNumber("0031", "469487541"));
        pb.printAllNamesAndNumbers();
        System.out.println("-----------------------------------");
        pb.printAllNames();
    }
}
