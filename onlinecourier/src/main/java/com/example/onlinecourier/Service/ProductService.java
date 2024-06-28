package com.example.onlinecourier.Service;

import com.example.onlinecourier.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
