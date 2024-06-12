package xyz.zalaya;

import lombok.Getter;
import lombok.Setter;
import xyz.zalaya.order.Order;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Battle {
    private final List<Order> orders;

    public Battle() {
        orders = new ArrayList<>();
    }

    public void executeOrder(Order order) {
        order.execute();
        orders.add(order);
    }
}
