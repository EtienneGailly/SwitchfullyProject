package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return pizzaRepository.findAll();
    }

    public void addPizza(PizzaDTO pizzaDTO) {
        pizzaRepository.save(pizzaMapper.mapToEntity(pizzaDTO));
    }

    public void addToppings(Long pizzaId, AddToppingsDto addToppingsDto) {
        this.pizzaRepository.getReferenceById(pizzaId).addToppings(mapToAdditionalToppings(addToppingsDto));
    }

    private static AdditionalToppings mapToAdditionalToppings(AddToppingsDto addToppingsDto) {
        return new AdditionalToppings(
                addToppingsDto.isWithMushrooms(),
                addToppingsDto.isWithMozzarella(),
                addToppingsDto.isWithPepperoni(),
                addToppingsDto.isWithHam(),
                addToppingsDto.isWithHotPeppers(),
                addToppingsDto.isWithOlives()
        );
    }

    public PizzaDTO getPizza(Long id) {
        return pizzaMapper.mapToDTO(this.pizzaRepository.getReferenceById(id));
    }
}
