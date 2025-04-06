package com.rutvik.devops.k8s_webapp.products.controller;


import com.rutvik.devops.k8s_webapp.products.model.Product;
import com.rutvik.devops.k8s_webapp.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/load")
    public ResponseEntity<List<Product>> loadProducts() {
        productService.loadAllProducts();
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.CREATED);
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product newProduct = productService.addProduct(product);

        if (newProduct != null)
            return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
        return new ResponseEntity<>(new Product(), HttpStatus.BAD_REQUEST);
    }
}
