package hw2;

import org.example.entityes.menu;
import org.example.serviceis.services;
import org.example.view.getresponse;

public class automate {
    private final services doughServices;

    public automate(services Services) {
        this.Services = Services;
    }

    public Menu[] getMenu() {
        return Menu.values();
    }

    public getresponse getproduct(String pizzaName) {
        Pizza pizza = service.getProductByName(pizzaName);
        Integer price = service.getProductPrice(pizza);
        if (price == null)
            return new GetResponse("Нет продукта");
        return new GetResponse(Name, price);
    }
}
