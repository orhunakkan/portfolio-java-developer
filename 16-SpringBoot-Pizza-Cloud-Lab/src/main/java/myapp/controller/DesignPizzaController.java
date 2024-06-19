package myapp.controller;

import myapp.bootstrap.DataGenerator;
import myapp.model.Pizza;
import myapp.repository.PizzaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
public class DesignPizzaController {

    private PizzaRepository pizzaRepository;

    @PostMapping
    public String showDesignForm(Model model) {
        model.addAttribute("cheeses", DataGenerator.cheeseTypeList);
        model.addAttribute("sauces", DataGenerator.sauceTypeList);
        model.addAttribute("toppings", DataGenerator.toppingTypeList);
        return "/design";
    }

    @PostMapping("/createPizza")
    public String processPizza(Pizza pizza) {
        pizza.setId(UUID.randomUUID());
        pizzaRepository.createPizza(pizza);
        return "redirect:/orders/current?pizzaId=" + pizza.getId();
    }
}
