package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "pizzas")
public class PizzaController {

    private final PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping(produces = "application/json")
    public List<PizzaDTO> getAllPizzas(){
        try {
            return pizzaService.getAllPizzas();
        } catch (Throwable t) {
            throw new IllegalArgumentException("Something went wrong", t);
        }
    }

    @PostMapping(consumes = "application/json")
    public void addPizza(@RequestBody PizzaDTO pizzaDTO){
        pizzaService.addPizza(pizzaDTO);
    }
}
