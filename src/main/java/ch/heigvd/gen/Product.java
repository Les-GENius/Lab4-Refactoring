package ch.heigvd.gen;

public class Product {
    public enum Size {
        XS,
        S,
        M,
        L,
        XL,
        XXL,
        SIZE_NOT_APPLICABLE
    }

    public enum Color {
        blue,
        red,
        yellow,
        none {
            @Override
            public String toString() {
                return "no color";
            }
        }
    }

    private String code;
    private Color color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    void getProductContent(StringBuffer sb) {
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(getColor());
        sb.append("\", ");

        if (getSize() != Size.SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"");
            sb.append(getSize());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(getCurrency());
        sb.append("\"}, ");
    }
}