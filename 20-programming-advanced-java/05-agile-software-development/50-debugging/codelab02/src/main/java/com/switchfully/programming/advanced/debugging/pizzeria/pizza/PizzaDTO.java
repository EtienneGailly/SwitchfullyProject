package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

import java.util.Objects;
import java.util.Optional;

public class PizzaDTO {

    private String type;
    private String customer;
    private String description;
    private Long minutesUntilReady;
    private boolean done;
    private AdditionalToppingsDto additionalToppingsDto;

    public PizzaDTO() {
    }

    public PizzaDTO(String type, String customer, String description, Long minutesUntilReady, boolean done, AdditionalToppingsDto additionalToppingsDto) {
        this.type = type;
        this.customer = customer;
        this.description = description;
        this.minutesUntilReady = minutesUntilReady;
        this.done = done;
        this.additionalToppingsDto = additionalToppingsDto;
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

    public Optional<AdditionalToppingsDto> getAdditionalToppingsDto() {
        return Optional.ofNullable(additionalToppingsDto);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaDTO pizzaDTO = (PizzaDTO) o;
        return done == pizzaDTO.done && Objects.equals(type, pizzaDTO.type) && Objects.equals(customer, pizzaDTO.customer) && Objects.equals(description, pizzaDTO.description) && Objects.equals(minutesUntilReady, pizzaDTO.minutesUntilReady) && Objects.equals(additionalToppingsDto, pizzaDTO.additionalToppingsDto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, customer, description, minutesUntilReady, done, additionalToppingsDto);
    }
}
