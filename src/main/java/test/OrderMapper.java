package test;

import java.util.Map;

public class OrderMapper {

    public Order parse(String input) {
        Map json = JsonParser.parse(input);

        Order order = new Order();
        order.setOrderNumber(json.get("orderNumber").toString());
        return order;
    }
}
