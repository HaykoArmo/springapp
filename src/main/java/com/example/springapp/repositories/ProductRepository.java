package com.example.springapp.repositories;
import org.springframework.data.repository.CrudRepository;
import com.example.springapp.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
}
