package basic.codelab02.elements;

public class Button {

    private final String label;

    public Button(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public Button changeLabel(String label) {
        return new Button(label);
    }

}
