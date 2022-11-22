package com.shopping.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.shop.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

}
