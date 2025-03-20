package com.javatechie.saga.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.saga.payment.entity.UserTransaction;

public interface UserTransactionRepository extends JpaRepository<UserTransaction,Integer>{

}
