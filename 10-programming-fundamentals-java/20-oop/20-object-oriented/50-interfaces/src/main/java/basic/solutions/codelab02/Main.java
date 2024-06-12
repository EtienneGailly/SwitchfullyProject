package basic.solutions.codelab02;

import basic.solutions.codelab02.elements.Image;
import basic.solutions.codelab02.elements.Table;

public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser();
        Table table = new Table(10, 20);
        table.insertInCell(5,5, "Hallo");
        browser.multiDownload(new Downloadable[]{
                new Image("someUrl", 500,600),
                new Image("someUrl", 500,600),
                new Image("someUrl", 500,600),
                new Image("someUrl", 500,600),
                table,
                new Table(10,20),
                new Table(10,20),
                new Table(10,20),
        });
    }
}
