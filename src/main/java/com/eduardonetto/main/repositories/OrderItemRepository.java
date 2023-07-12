package com.eduardonetto.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardonetto.main.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
