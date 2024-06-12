package basic.solutions.codelab01.sport;

public class Sport {

    private final String name;

    public Sport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void play() {
        System.out.println("Playing " + name);
    }
}
