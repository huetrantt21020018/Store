package org.example.store.service;

import org.example.store.dto.OrderDTO;
import org.example.store.dto.ProductDTO;
import org.example.store.entity.Order;

import java.util.List;

public interface OrderService {
    List<OrderDTO> getAllOrder();
    void saveOrder(OrderDTO order);
    void deleteOrder(Long pid);
    OrderDTO getOrderById(Long id);

}
