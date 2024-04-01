package org.example.store.service.impl;

import org.example.store.dto.OrderDTO;
import org.example.store.dto.ProductDTO;
import org.example.store.entity.Order;
import org.example.store.entity.Product;
import org.example.store.repository.OrderRepository;
import org.example.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.store.service.OrderService;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<OrderDTO> getAllOrder() {
        //return (List<Order>) orderRepository.findAll();
        List<Order> orders = (List<Order>) orderRepository.findAll();
        List<OrderDTO> dtos = new ArrayList<OrderDTO>();
        for(Order order: orders) {
            dtos.add(new OrderDTO(order, productRepository.findById(order.getPid()).get()));
        }
        return dtos;
    }

    @Override
    public void saveOrder(OrderDTO dto) {
        Order order = new Order(dto);
        System.out.println(order);
        orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long pid) {
        orderRepository.deleteById(pid);
    }

    @Override
    public OrderDTO getOrderById(Long id) {
        Order order = orderRepository.findById(id).get();
        Product product = productRepository.findById(order.getPid()).get();
        return new OrderDTO(order, product);
    }

}
