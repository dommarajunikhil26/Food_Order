package com.nikhil.foodOrderServer.repository;

import com.nikhil.foodOrderServer.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
