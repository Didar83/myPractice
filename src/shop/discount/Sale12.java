package shop.discount;

public class Sale12 extends Discount {

    public Sale12() {
        super("Sale12");
    }

    @Override
    public int getDiscountAmount(int total) {
        return (int) Math.round(total * 0.12);
    }
}
