package com.commerce.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.backend.entity.Product;
import com.commerce.backend.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private final ProductService productservice;

    public ProductController(ProductService productservice){
        this.productservice=productservice;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProducts(){// ResponseEntity to specify that the response will be http response
        List<Product> products=this.productservice.findAllProducts();
        return new ResponseEntity<>(products,HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id)
    {
       Product product=this.productservice.findProductById(id);
       return new ResponseEntity<>(product,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        Product productUpdated=this.productservice.updateProduct(product);
        return new ResponseEntity<>(productUpdated,HttpStatus.OK);
    }
     
    @PostMapping("/add")
    public ResponseEntity<Product> addNewProduct(@RequestBody Product product){
        Product newProduct=this.productservice.addNewProduct(product);
        return new ResponseEntity<>(newProduct,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable("id") Long id){
        this.productservice.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
