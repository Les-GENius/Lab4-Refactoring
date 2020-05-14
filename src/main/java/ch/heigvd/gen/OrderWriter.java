package ch.heigvd.gen;

public class OrderWriter {

    public void getOrderContent(StringBuffer sb, Order order) {
        ProductWriter productWriter = new ProductWriter();
        sb.append("{");
        sb.append("\"id\": ");
        sb.append(order.getOrderId());
        sb.append(", ");
        sb.append("\"products\": [");
        for (int j = 0; j < order.getProductsCount(); j++) {
            productWriter.getProductContent(sb, order.getProduct(j));
        }

        if (order.getProductsCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
        sb.append("}, ");
    }
}
