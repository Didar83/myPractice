package shop;

import shop.discount.Discount;

public class Order {
    private final int total;

    private final Discount[] discounts;

    public Order(int total, Discount... discounts) {
        this.total = total;
        this.discounts = discounts;
    }

    public int getTotalWithDiscount() {
        //
        int totalDiscount = 0;
        for (Discount discount : getDiscounts()) {
            totalDiscount += discount.getDiscountAmount(getTotal());
        }

        if (totalDiscount > (getTotal() * 0.2)) {
            return getTotal() - (int) Math.round(getTotal() * 0.2);
        } else {
            return getTotal() - totalDiscount;
        }
    }

    public int getTotal() {
        return total;
    }

    public Discount[] getDiscounts() {
        return discounts;
    }
}
