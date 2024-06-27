package myapp.repository;

import myapp.exception.PizzaNotFoundException;
import myapp.model.Pizza;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class PizzaRepository {

    private static final List<Pizza> pizzaList = new ArrayList<>();

    public void createPizza(Pizza pizzaToSave) {
        pizzaList.add(pizzaToSave);
    }

    public List<Pizza> readAll() {
        return pizzaList;
    }

    // TODO complete method
    public Pizza findPizzaById(UUID uuid) {
        return readAll().stream()
                .filter(pizza -> pizza.getId().equals(uuid))
                .findFirst().orElseThrow(() -> new PizzaNotFoundException("Pizza not found"));
    }
}
