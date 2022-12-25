package hw3.serviceis;

import hw3.entityes.Ingredient;
import hw3.entityes.Menu;
import hw3.entityes.Pizza;
import hw3.repository.IngredientRepository;
import hw3.view.GetPizzaResponse;

import java.util.ArrayList;
import java.util.List;

public class PizzaService {
    private IngredientRepository repository;

    public PizzaService(IngredientRepository repository) {
        this.repository = repository;
    }

    public Integer getPizzaPrice(Pizza pizza) {
        int price = 0;
        List<Ingredient> ingredients = repository.getAndDeleteIngredientsByNames(pizza.getListOfIngredients());
        if (ingredients.isEmpty())
            return null;
        for (Ingredient i : ingredients) {
            price += i.getPrice();
        }
        return price;
    }

    public Pizza getPizzaByName(String name) {
        return Menu.valueOf(name).getPizza();
    }
}