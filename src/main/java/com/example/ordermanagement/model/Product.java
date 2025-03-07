package com.example.ordermanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private String description;
    private Double price;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();
}