package org.example.store.dto;

import org.example.store.entity.Order;
import org.example.store.entity.Product;

public class OrderDTO {
    private Long pid;
    private String name;
    int count;
    int bill;

    public OrderDTO() {
    }

    public OrderDTO(Long id, String name, int count, int bill) {
        this.pid = id;
        this.name = name;
        this.count = count;
        this.bill = bill;
    }

    public OrderDTO(Order order, Product product) {
        this.pid = order.getPid();
        this.name = product.getName();
        this.count = order.getCount();
        this.bill = product.getPrice() * this.count;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getBill() {
        return bill;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

}
