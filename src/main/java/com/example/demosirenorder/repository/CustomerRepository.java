package com.example.demosirenorder.repository;

import com.example.demosirenorder.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
