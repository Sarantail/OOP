package hw3.entityes;

import java.lang.Comparable;

public enum Menu implements Comparable<Menu> {
    RONI(new Peperoni(),
            "Пеперони"),
    BARBECUE(new Barbecue(), "Барбекю"),
    MARGARITA(new Margarita(), "Маргарита");

    private final Pizza pizza;
    private final String name;

    Menu(Pizza pizza, String name) {
        this.pizza = pizza;
        this.name = name;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Menu p){
    
        return name.compareTo(p.getName());
    }
}