package com.example.demosirenorder.repository;

import com.example.demosirenorder.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
