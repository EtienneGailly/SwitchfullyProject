package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {

    Pizza getPizzaByCustomer(String name);
}
