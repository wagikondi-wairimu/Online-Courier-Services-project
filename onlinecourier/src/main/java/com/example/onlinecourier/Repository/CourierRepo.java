package com.example.onlinecourier.Repository;

import com.example.onlinecourier.Model.Courier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourierRepo extends JpaRepository <Courier,Long>{

}
