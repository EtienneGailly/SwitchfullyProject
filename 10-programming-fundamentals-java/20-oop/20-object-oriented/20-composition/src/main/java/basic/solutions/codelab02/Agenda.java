package basic.solutions.codelab02;

import java.time.LocalDate;

public class Agenda {

    private static final int MAX_NUMBER_OF_ENTRIES = 25;

    private String name;
    private Person owner;
    private Entry[] entries = new Entry[MAX_NUMBER_OF_ENTRIES];
    private int index = 0;

    public Agenda(String name, Person owner) {
        this.name = name;
        this.owner = owner;
    }

    public void addEntry(Entry newEntry) {
        if(entryForDateAlreadyExists(newEntry.getDate())) {
            System.out.println("An entry for date " + newEntry.getDate() + " already exists");
            return;
        }
        entries[index++] = newEntry;
    }

    private boolean entryForDateAlreadyExists(LocalDate date) {
        for(Entry entry: entries) {
            if(entry != null && entry.getDate().equals(date)) {
                return true;
            }
        }
        return false;
    }
}
