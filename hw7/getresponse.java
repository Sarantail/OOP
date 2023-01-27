package hw2;

import org.example.entityes.menu;

public class getresponse {
    private String error;
    private String name;
    private Integer price;

    public getresponse(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public getresponse(String error) {
        this.error = error;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
