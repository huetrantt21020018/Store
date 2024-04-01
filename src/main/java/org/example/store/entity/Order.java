package org.example.store.entity;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;
import org.example.store.dto.OrderDTO;

@Entity
@Table(name = "order_details")
public class Order {
    @Id
    private Long pid;
    @Column(name = "count")
    private int count;

    public Order() {}

    public Order(Long pid, int count) {
        this.pid = pid;
        this.count = count;
    }

    public Order(OrderDTO dto) {
        this.pid = dto.getPid();
        this.count = dto.getCount();
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getPid() {
        return pid;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Order{" +
                "pid=" + pid +
                ", count=" + count +
                '}';
    }
}
