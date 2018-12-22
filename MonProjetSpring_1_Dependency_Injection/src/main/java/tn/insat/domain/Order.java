package tn.insat.domain;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private String orderId;
    private LocalDate date;
    private List<Product> products;


    public Order() {
    }


    public Order(String orderId, LocalDate date, List<Product> products) {
        super();
        this.orderId = orderId;
        this.date = date;
        this.products = products;
    }


    public String getOrderId() {
        return orderId;
    }


    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    public LocalDate getDate() {
        return date;
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }


    public List<Product> getProducts() {
        return products;
    }


    public void setProducts(List<Product> products) {
        this.products = products;
    }


    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", date=" + date + ", products=" + products + "]";
    }


}
