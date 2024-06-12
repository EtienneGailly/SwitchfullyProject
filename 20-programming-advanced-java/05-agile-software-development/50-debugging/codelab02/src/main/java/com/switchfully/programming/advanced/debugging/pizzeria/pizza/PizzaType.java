package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

public enum PizzaType {
    HAWAII("hawaii"), QUATTRO_FORMAGGI("quattro formaggi"), CAPRICCIOSA("capricciosa"), AI_FUNGHI("ai funghi");

    private final String label;

    PizzaType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
