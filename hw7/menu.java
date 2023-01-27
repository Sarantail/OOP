package hw2;

//Принцип единственной ответственности
public class menu {

    private final String name;

    Menu(Product product, String name) {
        this.product = product;
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public String getName() {
        return name;
    }
}
