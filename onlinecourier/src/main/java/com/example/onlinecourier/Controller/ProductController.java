package com.example.onlinecourier.Controller;

import com.example.onlinecourier.Model.*;
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
@PostMapping("/{productId}/buy")
    public Order buyProduct(@PathVariable Long productId,RequestParam Integer quantity){
    return productService.buyProduct(productId,quantity);
}

@PutMapping("/return/{orderId}")
    public Order returnProduct (@PathVariable long  orderId){
    return  productService.returnProduct(orderId);
}
@PostMapping("/payment")
    public Payment processPayment(@RequestBody Payment payment){
    return productService.processPayment(payment);
}
@GetMapping("/company")
    public  List<Company> getCompanyDetails(){
    return  productService.getCompanyDetails();
}
@GetMapping("/hubrates")
    public List<HubRate> getHubRate(){
    return productService.getHubRates();
}
@PostMapping("/delivery")
    public DeliveryDetails saveDeliveryDetails(@RequestBody DeliveryDetails deliveryDetails){
    return productService.saveDeliveryDetails(deliveryDetails);
}
@PostMapping("/nondelivery")
    public  NonDeliveryDetails saveNonDeliveryDetails(@RequestBody NonDeliveryDetails nonDeliveryDetails){
    return  productService.saveDeliveryDetails(nonDeliveryDetails);
}
@PostMapping("/review")
    public Review addReview(@RequestBody Review review){
    return productService.addReview(review);
}
@GetMapping("/{productId}/review")
    public List<Review>getReviewByProductId(@PathVariable long productId){
    return productService.getReviewsByProductId(productId);
}
}
