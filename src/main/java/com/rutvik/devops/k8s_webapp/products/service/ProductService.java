package com.rutvik.devops.k8s_webapp.products.service;

import com.rutvik.devops.k8s_webapp.products.model.Product;
import com.rutvik.devops.k8s_webapp.products.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void loadAllProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "product-1", "product-1-description", 100.0));
        products.add(new Product(2, "product-2", "product-2-description", 400.0));
        products.add(new Product(3, "product-3", "product-3-description", 1300.0));
        products.add(new Product(4, "product-4", "product-4-description", 1200.0));
        products.add(new Product(5, "product-5", "product-5-description", 1100.0));

        productRepository.saveAll(products);
    }

}
