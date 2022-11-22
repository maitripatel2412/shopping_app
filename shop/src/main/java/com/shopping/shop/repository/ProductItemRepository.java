package com.shopping.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.shop.entity.ProductItem;

@Repository
public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {

}
