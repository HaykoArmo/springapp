package com.example.springapp.services;

import com.example.springapp.commands.ProductForm;
import com.example.springapp.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
