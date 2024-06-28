package com.example.onlinecourier.Repository;

import com.example.onlinecourier.Model.NonDeliveryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NonDeliveryDetailsRepository extends JpaRepository<NonDeliveryDetails,Long> {
}
