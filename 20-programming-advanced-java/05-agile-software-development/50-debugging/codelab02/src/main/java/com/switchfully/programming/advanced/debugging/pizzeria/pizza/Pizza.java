package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

import jakarta.persistence.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;

@Entity
@Table(name = "PIZZA")
public class Pizza {

    public static final int TIME_TO_COMPLETE = 30;

    @Column
    @Enumerated(EnumType.STRING)
    private PizzaType pizzaType;
    @Column
    private String customer;
    @Column
    private String description;
    @Column
    private LocalDateTime creationDate;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pizza_seq")
    @SequenceGenerator(name = "pizza_seq", sequenceName = "pizza_seq", initialValue = 1, allocationSize = 1)
    private Long id;
    @Embedded
    private AdditionalToppings additionalToppings;

    protected Pizza() {
    }

    public Pizza(PizzaType pizzaType, String customer, String description, LocalDateTime creationDate) {
        this.pizzaType = pizzaType;
        this.customer = customer;
        this.description = description;
        this.creationDate = creationDate;
        this.additionalToppings = AdditionalToppings.noAdditionalToppings();
    }

    public PizzaType getType() {
        return pizzaType;
    }

    public String getCustomer() {
        return customer;
    }

    public String getDescription() {
        return description;
    }

    public Long getTimeUntilCompletion(LocalDateTime now) {
        return Math.max(0, TIME_TO_COMPLETE - Duration.between(creationDate, now).toMinutes());
    }

    public boolean isDone(LocalDateTime now) {
        return getTimeUntilCompletion(now) == 0;
    }

    public Optional<AdditionalToppings> getAdditionalToppings() {
        return Optional.ofNullable(additionalToppings);
    }

    public void addToppings(AdditionalToppings additionalToppings) {
        this.additionalToppings = additionalToppings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return pizzaType == pizza.pizzaType && Objects.equals(getCustomer(), pizza.getCustomer()) && Objects.equals(getDescription(), pizza.getDescription()) && Objects.equals(creationDate, pizza.creationDate) && Objects.equals(id, pizza.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizzaType, getCustomer(), getDescription(), creationDate, id);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaType=" + pizzaType +
                ", customer='" + customer + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", id=" + id +
                '}';
    }
}
