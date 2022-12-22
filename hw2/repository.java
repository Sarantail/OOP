package hw2;

import org.example.entityes.product;
import org.example.entityes.productNameEnum;

import java.util.ArrayList;
import java.util.List;

public class repository {
    private ArrayList<product> product = new ArrayList<>();

    public List<product> getAndDeleteproductByNames(List<productNameEnum> nameList) {

        ArrayList<product> answer = new ArrayList<>();

        for (productNameEnum name : nameList) {
            product productByName = null;
            for (product product : product) {
                if (product.getName().equals(name)) {
                    productByName = product;
                    break;
                }
            }
            if (productByName == null)
                return new ArrayList<>();
            answer.add(productByName);
        }
        for (product product : answer)
            product.remove(product);
        return answer;
    }

    public void addproduct(product product) {
        this.product.add(product);
    }
}
