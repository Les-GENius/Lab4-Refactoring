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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{\"orders\": [");

        for (Order order : orders)
            sb.append(order);

        if (getOrdersCount() > 0)
            sb.delete(sb.length() - 2, sb.length());

        return sb.append("]}").toString();
    }
}
