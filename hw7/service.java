package hw2;

import org.example.entityes.Ingredient;
import org.example.entityes.Menu;
import org.example.entityes.Pizza;
import org.example.repository.IngredientRepository;
import org.example.view.GetPizzaResponse;

import java.util.ArrayList;
import java.util.List;

public class service {
    private repository repository;

    public service(repository repository) {
        this.repository = repository;
    }

    public Integer getPizzaPrice(product product) {
        int price = 0;
        List<product> ingredients = repository.getAndDeleteIngredientsByNames(product.getListOfproducts());
        if (ingredients.isEmpty())
            return null;
        for (product i : ingredients) {
            price += i.getPrice();
        }
        return price;
    }

    public product getproductByName(String name) {
        return menu.valueOf(name).getproduct();
    }
}
