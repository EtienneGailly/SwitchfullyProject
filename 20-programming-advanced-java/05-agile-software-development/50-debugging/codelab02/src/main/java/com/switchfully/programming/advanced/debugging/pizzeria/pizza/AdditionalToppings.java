package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AdditionalToppings {

    @Column
    private boolean withMushrooms;
    @Column
    private boolean withMozzarella;
    @Column
    private boolean withPepperoni;
    @Column
    private boolean withHam;
    @Column
    private boolean withHotPeppers;
    @Column
    private boolean withOlives;

    protected AdditionalToppings() {
    }

    public static AdditionalToppings noAdditionalToppings() {
        return new AdditionalToppings(false,false,false,false,false,false);
    }

    public AdditionalToppings(boolean withMushrooms, boolean withMozzarella, boolean withPepperoni, boolean withHam, boolean withHotPeppers, boolean withOlives) {
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
