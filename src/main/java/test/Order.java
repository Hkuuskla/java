package test;

import java.util.concurrent.atomic.AtomicLong;

public class Order {
    private static AtomicLong longAdd = new AtomicLong(0);
    private long id = 0L;
    private String orderNumber;

    public Order() {
        id = longAdd.incrementAndGet();
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\": \"" + getId() + "\", " +
                "\"orderNumber\": \"" + getOrderNumber() + "\" }";
    }

    private Long getId() {
        return id;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }
}
