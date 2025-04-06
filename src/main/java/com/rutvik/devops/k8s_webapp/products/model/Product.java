package com.rutvik.devops.k8s_webapp.products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Product {

    @Id
    private int jobId;
    private String productName;
    private String description;
    private double productPrice;

    public Product() {
    }

    public Product(int jobId, String productName, String description, double productPrice) {
        this.jobId = jobId;
        this.productName = productName;
        this.description = description;
        this.productPrice = productPrice;
    }
}
