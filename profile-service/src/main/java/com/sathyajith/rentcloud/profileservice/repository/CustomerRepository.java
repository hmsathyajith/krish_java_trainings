package com.sathyajith.rentcloud.profileservice.repository;

import com.sathyajith.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
