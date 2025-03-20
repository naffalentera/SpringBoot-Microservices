package com.javatechie.saga.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.saga.payment.entity.UserBalance;

public interface UserBalanceRepository extends JpaRepository<UserBalance,Integer>{

}
