package basic.codelab01;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<Name, PhoneNumber> phoneBook = new HashMap<>();

    public void addNumberToName(Name name, PhoneNumber number) {
        phoneBook.put(name, number);
    }

    public PhoneNumber getNumberFromName(Name name) {
        return phoneBook.get(name);
    }

    public void removeNumberFromName(Name name) {
        phoneBook.remove(name);
    }

    public void updateNumberFromName(Name name, PhoneNumber number) {
        phoneBook.put(name, number);
    }

    public void printAllNames() {
        for (Name name : phoneBook.keySet()) {
            System.out.println(name.toString());
        }
    }

    public void printAllNamesAndNumbers() {
        for (Name name : phoneBook.keySet()) {
            System.out.println(name.toString() + " : " + phoneBook.get(name));
        }
    }
}
