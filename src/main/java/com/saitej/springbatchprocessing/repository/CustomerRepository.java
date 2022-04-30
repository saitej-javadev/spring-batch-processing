package com.saitej.springbatchprocessing.repository;

import com.saitej.springbatchprocessing.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
