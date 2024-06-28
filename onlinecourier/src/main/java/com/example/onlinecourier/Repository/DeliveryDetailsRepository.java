package com.example.onlinecourier.Repository;

import com.example.onlinecourier.Model.DeliveryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryDetailsRepository extends JpaRepository<DeliveryDetails,Long> {
}
