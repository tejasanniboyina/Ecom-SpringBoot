package com.teja.ecomproj.controller;


import com.teja.ecomproj.model.Product;
import com.teja.ecomproj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
  private  ProductService service;


    @RequestMapping("/product/{id]")
    public Product getProduct(@PathVariable int id){
        return service.getProduct();
    }

    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
}
