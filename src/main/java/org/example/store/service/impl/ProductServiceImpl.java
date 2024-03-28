package org.example.store.service.impl;

import org.example.store.dto.ProductDTO;
import org.example.store.entity.Product;
import org.example.store.repository.ProductRepository;
import org.example.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> getAllProduct() {
        List<Product> products = (List<Product>) productRepository.findAll();
        List<ProductDTO> dtos = new ArrayList<>();
        for(Product product: products) dtos.add(new ProductDTO(product));
        return dtos;
    }

    @Override
    public void saveProduct(ProductDTO dto) {
        productRepository.save(new Product(dto));
    }

    @Override
    public void deleteProduct(Long pid) {
        productRepository.deleteById(pid);
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return new ProductDTO(productRepository.findById(id).get());
    }
}
