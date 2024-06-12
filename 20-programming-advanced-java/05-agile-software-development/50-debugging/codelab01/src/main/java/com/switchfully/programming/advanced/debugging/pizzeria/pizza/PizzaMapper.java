package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

import com.switchfully.programming.advanced.debugging.pizzeria.time.TimeProvider;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PizzaMapper {

    private final TimeProvider timeProvider;

    public PizzaMapper(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public List<PizzaDTO> mapToDTO(List<Pizza> pizzaList) {
        return pizzaList.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private PizzaDTO mapToDTO(Pizza pizza) {
        LocalDateTime now = timeProvider.getCurrentTime();
        return new PizzaDTO(pizza.getType().getLabel(), pizza.getCustomer(), pizza.getDescription(), pizza.getTimeUntilCompletion(now), pizza.isDone(now));
    }

    public Pizza mapToEntity(PizzaDTO pizzaDTO) {
        return new Pizza(PizzaType.valueOf(pizzaDTO.getType().toUpperCase()), pizzaDTO.getCustomer(), pizzaDTO.getDescription(), timeProvider.getCurrentTime());
    }
}
