package com.example.onlinecourier.Controller;

import com.example.onlinecourier.Model.Order;
import com.example.onlinecourier.Model.Product;
import com.example.onlinecourier.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
@Autowired
private ProductService productService;
@GetMapping
public List<Product>getAllProducts(){
    return productService.getAllProducts();

   }
@PostMapping
    public Order buyProduct(@PathVariable Long productId,RequestParam Integer quantity){
    return productService.buyProduct(productId,quantity);
}




}
