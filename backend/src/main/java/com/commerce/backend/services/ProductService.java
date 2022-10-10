package com.commerce.backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.commerce.backend.Repositories.ProductRepo;
import com.commerce.backend.entity.Product;

import com.commerce.backend.exception.UserNotFoundException;

@Service
public class ProductService{

    private final ProductRepo productrepo;

    public ProductService(ProductRepo productrepo){
        this.productrepo=productrepo;
    }
   
    public List<Product> findAllProducts(){
        return this.productrepo.findAll();
    }

    public Product findProductById(Long id){
        return this.productrepo.findProductById(id)
        .orElseThrow(()->new UserNotFoundException("User by id "+id+" was not found"));
    }

    public Product updateProduct(Product product){
      return this.productrepo.save(product);
    }

    public Product addNewProduct(Product product){
        return this.productrepo.save(product);
    }

    public void deleteProduct(Long id){
        this.productrepo.deleteById(id);
    }
    
}
