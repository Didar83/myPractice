package shop;

import shop.discount.Sale12;
import shop.discount.SpecialD;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(179000, new Sale12()));
        orders.add(new Order(225000, new SpecialD()));
        orders.add(new Order(477000, new SpecialD()));
        for(Order order : orders){
            System.out.println(order.getTotalWithDiscount());
        }
    }
}
