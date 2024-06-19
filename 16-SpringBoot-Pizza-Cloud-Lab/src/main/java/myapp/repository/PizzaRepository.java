package myapp.repository;

import myapp.model.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PizzaRepository {

    private static final List<Pizza> pizzaList = new ArrayList<>();

    public Pizza createPizza(Pizza pizzaToSave) {
        pizzaList.add(pizzaToSave);
        return pizzaToSave;
    }

    public List<Pizza> readAll() {
        return pizzaList;
    }

    // TODO complete method
    public Pizza findPizzaById(UUID uuid) {
        return new Pizza();
    }

}
