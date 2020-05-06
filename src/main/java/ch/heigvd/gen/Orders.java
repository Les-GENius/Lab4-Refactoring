package ch.heigvd.gen;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<Order> orders = new ArrayList<Order>();

    public void AddOrder(Order order) {
        orders.add(order);
    }

    public int getOrdersCount() {
        return orders.size();
    }

    public Order getOrder(int i) {
        return orders.get(i);
    }

    public String toString(){

        StringBuilder result = new StringBuilder("{\"orders\": [");
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            result.append(order.toString());
        }

        if (orders.size() > 0) {
            result.delete(result.length() - 2, result.length());
        }

        return result.append("]}").toString();
    }
}
