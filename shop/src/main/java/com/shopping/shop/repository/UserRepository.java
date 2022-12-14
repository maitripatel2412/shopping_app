package com.shopping.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.shop.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
