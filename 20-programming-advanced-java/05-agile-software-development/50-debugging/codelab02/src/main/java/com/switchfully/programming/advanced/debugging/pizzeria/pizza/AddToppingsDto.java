package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

public class AddToppingsDto {
    private boolean withMushrooms;
    private boolean withMozzarella;
    private boolean withPepperoni;
    private boolean withHam;
    private boolean withHotPeppers;
    private boolean withOlives;

    protected AddToppingsDto() {
    }

    public AddToppingsDto(boolean withMushrooms, boolean withMozzarella, boolean withPepperoni, boolean withHam, boolean withHotPeppers, boolean withOlives) {
        this.withMushrooms = withMushrooms;
        this.withMozzarella = withMozzarella;
        this.withPepperoni = withPepperoni;
        this.withHam = withHam;
        this.withHotPeppers = withHotPeppers;
        this.withOlives = withOlives;
    }

    public boolean isWithMushrooms() {
        return withMushrooms;
    }

    public boolean isWithMozzarella() {
        return withMozzarella;
    }

    public boolean isWithPepperoni() {
        return withPepperoni;
    }

    public boolean isWithHam() {
        return withHam;
    }

    public boolean isWithHotPeppers() {
        return withHotPeppers;
    }

    public boolean isWithOlives() {
        return withOlives;
    }
}
