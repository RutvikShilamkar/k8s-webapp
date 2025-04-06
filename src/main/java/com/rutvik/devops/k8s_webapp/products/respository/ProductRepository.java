package com.rutvik.devops.k8s_webapp.products.respository;

import com.rutvik.devops.k8s_webapp.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
