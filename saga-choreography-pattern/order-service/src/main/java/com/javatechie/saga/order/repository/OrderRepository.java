package com.javatechie.saga.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.saga.order.entity.PurchaseOrder;

public interface OrderRepository extends JpaRepository<PurchaseOrder,Integer>{

}
