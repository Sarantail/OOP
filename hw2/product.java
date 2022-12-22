package hw2;

public class product {
    private productNameEnum name;
    private int price;

    public product(productNameEnum name, int price) {
        this.name = name;
        this.price = price;
    }

    public productNameEnum getName() {
        return name;
    }

    public void setName(productNameEnum name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
