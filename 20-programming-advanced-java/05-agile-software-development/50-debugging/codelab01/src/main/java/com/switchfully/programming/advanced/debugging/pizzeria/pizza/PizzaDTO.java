package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

import java.util.Objects;

public class PizzaDTO {

    private String type;
    private String customer;
    private String description;
    private Long minutesUntilReady;
    private boolean done;

    public PizzaDTO() {
    }

    public PizzaDTO(String type, String customer, String description, Long minutesUntilReady, boolean done) {
        this.type = type;
        this.customer = customer;
        this.description = description;
        this.minutesUntilReady = minutesUntilReady;
        this.done = done;
    }

    public String getType() {
        return type;
    }

    public String getCustomer() {
        return customer;
    }

    public String getDescription() {
        return description;
    }

    public Long getMinutesUntilReady() {
        return minutesUntilReady;
    }

    public boolean isDone(){
        return done;
    }

    @Override
    public String toString() {
        return "PizzaDTO{" +
                "type='" + type + '\'' +
                ", customer='" + customer + '\'' +
                ", description='" + description + '\'' +
                ", minutesUntilCompletion=" + minutesUntilReady +
                ", done=" + done +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaDTO that = (PizzaDTO) o;
        return done == that.done && Objects.equals(type, that.type) && Objects.equals(customer, that.customer) && Objects.equals(description, that.description) && Objects.equals(minutesUntilReady, that.minutesUntilReady);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, customer, description, minutesUntilReady, done);
    }
}
