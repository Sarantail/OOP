package hw3.entityes;

import java.util.Arrays;
import java.util.List;

import static hw3.entityes.IngredientNameEnum.*;

public class Barbecue implements Pizza {
    private static List<IngredientNameEnum> listOfIngredients = Arrays.asList(
            SAUCE,
            SAUSAGE,
            TOMATO,
            CHEESE);

    @Override
    public List<IngredientNameEnum> getListOfIngredients() {
        return listOfIngredients;
    }

    public static void setListOfIngredients(List<IngredientNameEnum> listOfIngredients) {
        Barbecue.listOfIngredients = listOfIngredients;
    }
}
