package myapp.controller;

import myapp.bootstrap.DataGenerator;
import myapp.model.Pizza;
import myapp.repository.PizzaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/design")
public class DesignPizzaController {

    private final PizzaRepository pizzaRepository;

    public DesignPizzaController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @GetMapping //design
    public String showDesignForm(Model model) {
        model.addAttribute("pizza", new Pizza());
        model.addAttribute("cheeses", DataGenerator.cheeseTypeList);
        model.addAttribute("sauces", DataGenerator.sauceTypeList);
        model.addAttribute("toppings", DataGenerator.toppingTypeList);
        return "/design";
    }

    @PostMapping("/createPizza") // /design/createPizza
    public String processPizza(Pizza pizza) {
        pizza.setId(UUID.randomUUID());
        pizzaRepository.createPizza(pizza); // null.createPizza()
        return "redirect:/orders/current?pizzaId=" + pizza.getId();
    }
}
