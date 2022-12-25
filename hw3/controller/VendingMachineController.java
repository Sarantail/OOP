package hw3.controller;

import hw3.entityes.Menu;
import hw3.entityes.Pizza;
import hw3.serviceis.DoughServices;
import hw3.serviceis.PizzaService;
import hw3.view.GetDoughByNameResponse;
import hw3.view.GetPizzaResponse;

public class VendingMachineController {
    private final DoughServices doughServices;
    private final PizzaService pizzaService;

    public VendingMachineController(DoughServices doughServices, PizzaService pizzaService) {
        this.doughServices = doughServices;
        this.pizzaService = pizzaService;
    }

    public GetDoughByNameResponse getDough(String name) {
        return doughServices.getDoughByName(name);
    }

    public Menu[] getMenu() {
        return Menu.values();
    }

    public GetPizzaResponse getPizza(String pizzaName) {
        Pizza pizza = pizzaService.getPizzaByName(pizzaName);
        Integer price = pizzaService.getPizzaPrice(pizza);
        if (price == null)
            return new GetPizzaResponse("Нет необходимых ингридиентов на складе");
        return new GetPizzaResponse(pizzaName, price);
    }
}
