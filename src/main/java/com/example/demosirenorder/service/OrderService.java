package com.example.demosirenorder.service;

import com.example.demosirenorder.domain.CreateOrder;
import com.example.demosirenorder.domain.Order;
import com.example.demosirenorder.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void newOrder(CreateOrder createOrder) {
        Order entity = Order.newOrder(createOrder);

        orderRepository.save(entity);
    }
}