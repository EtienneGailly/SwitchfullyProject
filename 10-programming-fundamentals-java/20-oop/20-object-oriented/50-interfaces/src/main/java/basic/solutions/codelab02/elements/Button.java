package basic.solutions.codelab02.elements;

import basic.solutions.codelab02.Clickable;

public class Button implements Clickable {

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

    @Override
    public String click() {
        return "click";
    }

    @Override
    public String doubleClick() {
        return "doubleclick";
    }
}
