package org.example.store.controller;

import org.example.store.dto.ProductDTO;
import org.example.store.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.store.service.ProductService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    List<ProductDTO> products() {
        return productService.getAllProduct();
    }

    @GetMapping("/{pid}")
    ProductDTO getById(@PathVariable Long pid) {
        return productService.getProductById(pid);
    }

    @PostMapping("/create")
    void create(@RequestBody ProductDTO product) {
        productService.saveProduct(product);
    }

    @PutMapping("/update")
    void update(@RequestBody ProductDTO product) {
        productService.saveProduct(product);
    }

    @DeleteMapping("/delete/{pid}")
    void delete(@PathVariable Long pid) {
        productService.deleteProduct(pid);
    }
}
