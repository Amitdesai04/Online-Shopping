package com.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.datamodel.SalesOrder;

@Repository
public interface SalesOrderRepository extends JpaRepository<SalesOrder, Long> {
}