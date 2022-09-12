package com.microservices.repository;

import org.springframework.stereotype.Repository;

import com.microservices.datamodel.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}