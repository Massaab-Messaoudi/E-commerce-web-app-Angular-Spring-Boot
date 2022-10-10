package com.commerce.backend.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commerce.backend.entity.Product;

public interface ProductRepo extends JpaRepository <Product,Long> {
   Optional<Product>  findProductById(Long id); // spring will define implement automaticlly the methode , because of the 2 keyword (find....Id) 
}
