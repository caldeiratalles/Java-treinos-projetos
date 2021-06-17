package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date date;
    private OrderStatus status;

    public OrderItem getOrderitem() {
        return orderitem;
    }



    private OrderItem orderitem;
    private List<OrderItem> orders = new ArrayList<>();

    public Order(Date date, OrderStatus status) {
        this.date = date;
        this.status = status;
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {

        this.date = date;
    }

    public OrderStatus getStatus() {

        return status;
    }

    public void setStatus(OrderStatus status) {

        this.status = status;
    }

    public List<OrderItem> getOrders() {

        return orders;
    }

    public void addOrderItem(OrderItem order) {

        orders.add(order);
    }
    public void removeOrderItem(OrderItem order) {

        orders.remove(order);
    }

}
