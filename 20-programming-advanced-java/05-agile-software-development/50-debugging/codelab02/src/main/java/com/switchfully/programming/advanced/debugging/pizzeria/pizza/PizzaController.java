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

    @GetMapping(path = "/{id}", produces = "application/json")
    public PizzaDTO getPizza(@PathVariable Long id) {
        return pizzaService.getPizza(id);
    }

    @GetMapping(produces = "application/json")
    public List<PizzaDTO> getAllPizzas() {
        return pizzaService.getAllPizzas();
    }

    @PostMapping(consumes = "application/json")
    public void addPizza(@RequestBody PizzaDTO pizzaDTO) {
        pizzaService.addPizza(pizzaDTO);
    }

    @PutMapping(path = "/{id}", consumes = "application/json")
    public void addToppingsDto(@PathVariable(name = "id") Long id, @RequestBody AddToppingsDto addToppingsDto) {
        pizzaService.addToppings(id, addToppingsDto);
    }


}
