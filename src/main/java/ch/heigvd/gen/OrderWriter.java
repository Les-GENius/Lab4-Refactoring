package ch.heigvd.gen;

public class OrderWriter implements IWriter {

    private Order order;

    public OrderWriter(Order order){
        this.order = order;
    }

    @Override
    public String getContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"id\": ");
        sb.append(order.getOrderId());
        sb.append(", ");
        sb.append("\"products\": [");
        for (int j = 0; j < order.getProductsCount(); j++) {
            sb.append(new ProductWriter(order.getProduct(j)).getContent());
        }

        if (order.getProductsCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
        sb.append("}, ");
        return sb.toString();
    }
}