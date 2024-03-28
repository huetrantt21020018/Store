package org.example.store.service;

import org.example.store.dto.ProductDTO;
import org.example.store.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductDTO> getAllProduct();
    void saveProduct(ProductDTO productDTO);
    void deleteProduct(Long pid);
    ProductDTO getProductById(Long id);
}
