package org.example.store.service;

import org.example.store.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrder();
    void saveOrder(Order order);
    void deleteOrder(Long pid);

}
