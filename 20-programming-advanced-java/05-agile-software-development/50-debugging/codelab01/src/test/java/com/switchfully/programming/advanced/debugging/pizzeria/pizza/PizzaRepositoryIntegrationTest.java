package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class PizzaRepositoryIntegrationTest {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Test
    void whenSavingAnEntityInDB_ThenYouCanRetrieveIt() {
        Pizza pizza = new Pizza(PizzaType.QUATTRO_FORMAGGI, "Ben", "all four lactose-free cheeses, right?", LocalDateTime.now());
        pizzaRepository.save(pizza);

        List<Pizza> all = pizzaRepository.findAll();

        assertThat(all).hasSize(2).contains(pizza);
    }

    // The @DataJpaTest slice ONLY loads the persistence layer
    // @DataJpaTest uses an in-memory database - unless you say otherwise
}
