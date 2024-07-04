package com.example.onlinecourier.Service;

import com.example.onlinecourier.Model.*;
import com.example.onlinecourier.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private HubRateRepository hubRateRepository;
    @Autowired
    private DeliveryDetailsRepository deliveryDetailsRepository;
    @Autowired
    private  NonDeliveryDetailsRepository nonDeliveryDetailsRepository;
    @Autowired
    private ReviewRepository reviewRepository;
    // retrieve all products
    public List<Product>getAllProducts(){

        return productRepository.findAll();
    }

    public  Product addProduct(Product product){
        return productRepository.save(product);
    }

public Order buyProduct(Long productId,Integer quantity){
    Optional<Product>productOptional=productRepository.findById(productId);
    if (productOptional.isPresent()){
        Product product = productOptional.get();
        Order order =  new Order();
        order.setProduct(product);
        order.setQuantity(quantity);
        order.setStatus("ORDERED");
        return  orderRepository.save(order);

    }else{
        throw new RuntimeException("Product not found");
    }
}
//return a product
    public Order returnProduct(Long orderId) {
        Optional<Order> orderOptional = orderRepository.findById(orderId);
        if (orderOptional.isPresent()) {
            Order order = orderOptional.get();
            order.setStatus("RETURNED");
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("Order not found");
        }
    }


    // Process payment
    public Payment processPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    // Retrieve company details
    public List<Company> getCompanyDetails() {
        return companyRepository.findAll();
    }

    // Get hub rates
    public List<HubRate> getHubRates() {
        return hubRateRepository.findAll();
    }

    // Save delivery details
    public DeliveryDetails saveDeliveryDetails(DeliveryDetails deliveryDetails) {
        return deliveryDetailsRepository.save(deliveryDetails);
    }

    // Save non-delivery details
    public NonDeliveryDetails saveNonDeliveryDetails(NonDeliveryDetails nonDeliveryDetails) {
        return nonDeliveryDetailsRepository.save(nonDeliveryDetails);
    }

    // Add a review
    public Review addReview(Review review) {

    return reviewRepository.save(review);
    }

    // Retrieve all reviews for a product
    public List<Review> getReviewsByProductId(Long productId) {
        return reviewRepository.findByProductId(productId);
    }



}
