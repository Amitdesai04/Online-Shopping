package com.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.datamodel.Customer;

@Repository
public interface CustomerSORepository extends JpaRepository<Customer, Long> {
}