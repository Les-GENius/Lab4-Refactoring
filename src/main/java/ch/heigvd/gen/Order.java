package ch.heigvd.gen;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int j) {
        return products.get(j);
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    public String toString(){

        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("\"id\": ");
        result.append(id);
        result.append(", ");
        result.append("\"products\": [");

        for (int j = 0; j < products.size(); j++) {
            Product product = products.get(j);
            result.append(product.toString());
        }

        if (products.size() > 0) {
            result.delete(result.length() - 2, result.length());
        }

        result.append("]");
        result.append("}, ");

        return result.toString();
    }
}
