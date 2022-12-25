package hw3;

import hw3.controller.VendingMachineController;
import hw3.entityes.Dough;
import hw3.entityes.Ingredient;
import hw3.entityes.IngredientNameEnum;
import hw3.repository.DoughRepository;
import hw3.repository.IngredientRepository;
import hw3.serviceis.DoughServices;
import hw3.serviceis.PizzaService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DoughRepository doughRepository = new DoughRepository();
        IngredientRepository ingredientRepository = new IngredientRepository();

        doughRepository.addDough(new Dough(1, "1"));
        ingredientRepository.addIngredient(new Ingredient(IngredientNameEnum.CHEESE, 2));
        ingredientRepository.addIngredient(new Ingredient(IngredientNameEnum.SAUCE, 1));

        DoughServices doughServices = new DoughServices(doughRepository);
        PizzaService pizzaService = new PizzaService(ingredientRepository);

        VendingMachineController vendingMachineController = new VendingMachineController(doughServices, pizzaService);

        System.out.println(vendingMachineController.getDough("1"));
        System.out.println(Arrays.toString(vendingMachineController.getMenu()));
        System.out.println(vendingMachineController.getPizza("MARGARITA").getPrice());
        System.out.println(vendingMachineController.getPizza("MARGARITA").getError());
    }

}
