package ch.heigvd.gen;

public class OrdersWriter implements IWriter{
    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    @Override
    public String getContent() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        for (int i = 0; i < orders.getOrdersCount(); i++) {
            sb.append(new OrderWriter(orders.getOrder(i)).getContent());
        }

        if (orders.getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }
}