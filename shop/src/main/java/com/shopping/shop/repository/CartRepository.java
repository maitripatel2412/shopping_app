package com.shopping.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.shop.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

}
