package basic.solutions.codelab02;

import java.time.LocalDate;

public class Entry {
    private LocalDate date;
    private String title;

    public Entry(LocalDate date, String title) {
        this.date = date;
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }
}
