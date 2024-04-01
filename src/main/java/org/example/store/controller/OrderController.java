package org.example.store.controller;

import org.example.store.dto.OrderDTO;
import org.example.store.dto.ProductDTO;
import org.example.store.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.store.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping()
    List<OrderDTO> orders() {
        return orderService.getAllOrder();
    }

    @GetMapping("/{pid}")
    OrderDTO getById(@PathVariable Long pid) {
        return orderService.getOrderById(pid);
    }

    @PostMapping("/create")
    void create(@RequestBody OrderDTO order) {
        orderService.saveOrder(order);
    }

    @PutMapping("/update")
    void update(@RequestBody OrderDTO order) {
        orderService.saveOrder(order);
    }

    @DeleteMapping("/delete/{pid}")
    void delete(@PathVariable Long pid) {
        orderService.deleteOrder(pid);
    }
}
