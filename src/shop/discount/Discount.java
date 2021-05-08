package shop.discount;

public abstract class Discount {

    private final String name;

    public Discount(String name) {
        this.name = name;
    }

    public abstract int getDiscountAmount(int total);

    public String getName() {
        return name;
    }
}
