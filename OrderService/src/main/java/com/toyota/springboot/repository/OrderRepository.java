package com.toyota.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toyota.springboot.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

}
