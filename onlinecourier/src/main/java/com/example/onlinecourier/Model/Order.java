package com.example.onlinecourier.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private  Integer quantity;
    private String status;
    private  Date orderDate = new Date();


    public void setQuantity(Integer quantity) {
    }

    public void setStatus(String returned) {
    }

    public void setProduct(Product product) {
    }
}
