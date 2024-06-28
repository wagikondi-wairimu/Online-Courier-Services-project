package com.example.onlinecourier.Repository;

import com.example.onlinecourier.Model.HubRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubRateRepository extends JpaRepository<HubRate,Long> {
}
