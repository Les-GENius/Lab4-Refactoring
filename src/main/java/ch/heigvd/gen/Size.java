package ch.heigvd.gen;

public enum Size {
    SIZE_NOT_APPLICABLE("Invalid Size"),
    XS("XS"),
    S("S"),
    M("M"),
    L("L"),
    XL("XL"),
    XXL("XXL");

    private final String text;

    Size(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
