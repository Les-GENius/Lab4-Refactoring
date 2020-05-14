package ch.heigvd.gen;

import java.util.List;

public class OrdersWriter implements IWriter{

    private List<Order> orders;

    public OrdersWriter(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String getContent() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        for (int i = 0; i < orders.size(); i++) {
            sb.append(new OrderWriter(orders.get(i)).getContent());
        }

        if (orders.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }
}