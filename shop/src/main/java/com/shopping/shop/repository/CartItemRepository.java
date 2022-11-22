package com.shopping.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.shop.entity.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
