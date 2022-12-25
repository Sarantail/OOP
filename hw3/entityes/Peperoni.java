package hw3.entityes;

import java.util.Arrays;
import java.util.List;

import static hw3.entityes.IngredientNameEnum.*;

public class Peperoni implements Pizza {
    private static List<IngredientNameEnum> listOfIngredients = Arrays.asList(
            SAUSAGE,
            SAUCE,
            CHEESE);

    @Override
    public List<IngredientNameEnum> getListOfIngredients() {
        return listOfIngredients;
    }

    public static void setListOfIngredients(List<IngredientNameEnum> ingredients) {
        listOfIngredients = ingredients;
    }
}
