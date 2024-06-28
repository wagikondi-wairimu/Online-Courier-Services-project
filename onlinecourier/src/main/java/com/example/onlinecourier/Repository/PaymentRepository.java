package com.example.onlinecourier.Repository;

import com.example.onlinecourier.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository <Payment,Long>{

}
