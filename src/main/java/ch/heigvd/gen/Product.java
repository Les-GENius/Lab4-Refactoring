package ch.heigvd.gen;


public class Product {
    static enum Color {blue, red, yellow, no_color};
    static enum Size {SIZE_NOT_APPLICABLE, XS, S, M, L, XL, XXL};
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

    public Size getSize() { return size; }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("\"code\": \"");
        result.append(code);
        result.append("\", ");
        result.append("\"color\": \"");
        result.append(color);
        result.append("\", ");
        if (size != (Size.SIZE_NOT_APPLICABLE)) {
            result.append("\"size\": \"");
            result.append(size);
            result.append("\", ");
        }
        result.append("\"price\": ");
        result.append(price);
        result.append(", ");
        result.append("\"currency\": \"");
        result.append(currency);
        result.append("\"}, ");
        return result.toString();
    }
}