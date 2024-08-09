package com.teja.ecomproj.controller;


import com.teja.ecomproj.model.Product;
import com.teja.ecomproj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
  private  ProductService service;

    @RequestMapping("/")
    public String greet(){
        return "Hello World..";
    }

    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
}
