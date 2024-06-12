package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PizzaControllerIntegrationTest {

    @Autowired
    private PizzaController pizzaController;

    @Test
    void givenEmptyRepository_whenAddingPizza_thenReturnSinglePizza() {
        //given
        PizzaDTO pizzaDTO = new PizzaDTO("capricciosa", "Ben", "without ham please", 30L, false);
        pizzaController.addPizza(pizzaDTO);
        //when
        List<PizzaDTO> allPizzas = pizzaController.getAllPizzas();
        //then
        Assertions.assertThat(allPizzas).contains(pizzaDTO);
    }
}
