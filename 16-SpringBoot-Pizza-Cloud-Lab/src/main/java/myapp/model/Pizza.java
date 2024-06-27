package myapp.model;

import lombok.Data;
import myapp.enums.Cheese;
import myapp.enums.Sauce;
import myapp.enums.Topping;

import java.util.List;
import java.util.UUID;

@Data
public class Pizza {

    private UUID id;
    private List<Cheese> cheeseList;
    private List<Sauce> sauceList;
    private List<Topping> toppingList;

}
