package org.example.store.dto;

import org.example.store.entity.Product;

public class ProductDTO {
    private Long pid;
    private String name;
    private int price;
    private String description;

    public ProductDTO() {}
    public ProductDTO(Product product) {
        this.pid = product.getPid();
        this.name = product.getName();
        this.price = product.getPrice();
        this.description = product.getDescription();
    }

    public ProductDTO(Long pid, String name, int price, String description) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Long getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
