package shop.discount;

public class ExtraD extends Discount {

    public ExtraD() {
        super("ExtraD");
    }

    @Override
    public int getDiscountAmount(int total) {
        if (total > 150000) {
            return (int) Math.round(0.04 * total);
        } else if (total < 100000) {
            return (int) Math.round(0.1 * total);
        } else {
            return (int) Math.round(0.07 * total);
        }
    }
}
