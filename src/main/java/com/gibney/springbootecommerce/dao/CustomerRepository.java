package com.gibney.springbootecommerce.dao;

import com.gibney.springbootecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
