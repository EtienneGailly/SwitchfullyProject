package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

import java.util.Objects;

public class AdditionalToppingsDto {

    private boolean withMushrooms;
    private boolean withMozzarella;
    private boolean withPepperoni;
    private boolean withHam;
    private boolean withHotPeppers;
    private boolean withOlives;

    private AdditionalToppingsDto() {
    }

    public AdditionalToppingsDto(AdditionalToppings additionalToppings) {
        this.withMushrooms = additionalToppings.isWithMushrooms();
        this.withMozzarella = additionalToppings.isWithMozzarella();
        this.withPepperoni = additionalToppings.isWithPepperoni();
        this.withHam = additionalToppings.isWithHam();
        this.withOlives = additionalToppings.isWithOlives();
    }

    public AdditionalToppingsDto(boolean withMushrooms, boolean withMozzarella, boolean withPepperoni, boolean withHam, boolean withHotPeppers, boolean withOlives) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdditionalToppingsDto that = (AdditionalToppingsDto) o;
        return withMushrooms == that.withMushrooms && withMozzarella == that.withMozzarella && withPepperoni == that.withPepperoni && withHotPeppers == that.withOlives && withOlives == that.withHotPeppers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(withMushrooms, withMozzarella, withPepperoni, withHam, withHotPeppers, withOlives);
    }
}
