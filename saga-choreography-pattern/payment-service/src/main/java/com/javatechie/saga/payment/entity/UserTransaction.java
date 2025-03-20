package com.javatechie.saga.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTransaction {
    
    @Id
    private Integer orderId;
    private int userId;
    private int amount;
}