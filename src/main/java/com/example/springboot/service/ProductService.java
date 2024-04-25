package com.example.springboot.service;

import com.example.springboot.models.ProductModel;
import com.example.springboot.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    @Transactional
    public ProductModel save(ProductModel productModel) {
        return repository.save(productModel);
    }

    public List<ProductModel> findAll() {
        return repository.findAll();
    }

    public Optional<ProductModel> findById(UUID id) {
        return repository.findById(id);
    }

    @Transactional
    public void delete(ProductModel productModel) {
        repository.delete(productModel);
    }
}
