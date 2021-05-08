package shop.discount;

public class SpecialD extends Discount {

    public SpecialD() {
        super("SpecialD");
    }

    @Override
    public int getDiscountAmount(int total) {
        if (total <= 250000) {
            return (int) Math.round(0.15 * total);
        }
        return 0;
    }
}
