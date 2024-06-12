package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.switchfully.programming.advanced.debugging.pizzeria.pizza.Pizza.DEFAULT_PIZZA;

@Service
@Transactional
public class PizzaService {

    private final PizzaRepository pizzaRepository;
    private final PizzaMapper pizzaMapper;

    public PizzaService(PizzaRepository pizzaRepository, PizzaMapper pizzaMapper) {
        this.pizzaRepository = pizzaRepository;
        this.pizzaMapper = pizzaMapper;
    }

    public List<PizzaDTO> getAllPizzas() {
        List<Pizza> pizzas = getPizzasWithDefaultPizza();
        return pizzaMapper.mapToDTO(pizzas);
    }

    private List<Pizza> getPizzasWithDefaultPizza() {
        List<Pizza> pizzas = pizzaRepository.findAll();
        pizzas.add(DEFAULT_PIZZA);
        return pizzas;
    }

    public void addPizza(PizzaDTO pizzaDTO) {
        pizzaRepository.save(pizzaMapper.mapToEntity(pizzaDTO));
    }
}
